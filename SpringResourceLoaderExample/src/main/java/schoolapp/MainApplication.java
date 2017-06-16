package schoolapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class MainApplication {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("SpringBean.xml");
		/*
		 * It identifies the specified path as classpath and accordingly convert to classpath
		 * 
		 * Method 1 : 
		 * 		without getting handle to bean by calling getBean()
		 * 		Here, we are calling getResource of ResourceLoader interface directly	 
		 * 
		*/
//		Resource resource = context.getResource("/schoolapp/studentdetails.properties");
		
		
		/*
		 * Method 2 : By getting handle to bean and then calling getResource of Student
		 * 
		*/
		Student student = context.getBean("studentId", Student.class);
		Resource resource = student.getResource("/schoolapp/studentdetails.properties");
		
		try(InputStream is = resource.getInputStream(); 
			BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
			
			String line;
			while((line=br.readLine())!= null){
				System.out.println(line);				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
