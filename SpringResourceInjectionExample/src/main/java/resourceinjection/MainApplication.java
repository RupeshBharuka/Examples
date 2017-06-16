/*
 * Example of setter based Resource injection  
 *
*/

package resourceinjection;

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
		
		ProductService ps = context.getBean("productService", ProductService.class);
		Resource resource = ps.getExternalResource();
		
		/* 
		 * try with resource java 7 concept
		 * Note : whatever the resource we are specifying in try block that resource must implement AutoClosable interface
		 * 
		 */
		try(InputStream is = resource.getInputStream(); BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
			String line;
			while((line = br.readLine()) != null){
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}		

	}

}
