package resourceinjection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class MainApplication {

	private static ApplicationContext context;
	private static Scanner scan;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("SpringBean.xml");
		ProductService ps = context.getBean("productService", ProductService.class);
		
		// accepting file name with location from user
		System.out.println("Enter file location with file name : ");
		scan = new Scanner(System.in);
		String fileLocation = scan.next();
		
		Resource resource = ps.getResource("file:" +fileLocation);
//		Resource resource = ps.getResource("url:" +fileLocation); //https://ocw.mit.edu/ans7870/6/6.006/s08/lecturenotes/files/t8.shakespeare.txt
		
		/*
		 * try with resource java 7
		 * Note: The resource which you are passing inside try block must implement AutoClosable interface
		 * 
		*/
		try(InputStream is = resource.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
			
			String line;
			while((line = br.readLine())!= null)
				System.out.println(line);

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
