package propertyplaceholderdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
	private static ApplicationContext context;

	public static void main(String[] args) {
	
		context = new ClassPathXmlApplicationContext("SpringBean.xml");
		Login login = context.getBean("loginId", Login.class);
		
		System.out.println("User Name : " +login.getUsername());
		System.out.println("Password : " +login.getPassword()); 
		
	}
}
