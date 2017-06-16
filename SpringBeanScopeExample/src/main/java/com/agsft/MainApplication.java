package com.agsft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
	
	private static ApplicationContext context;

	public static void main(String[] args) {
	
		context = new ClassPathXmlApplicationContext("SpringBean.xml");
		CustomerService cs1 = context.getBean("customerServiceId" ,CustomerService.class);
		
		/*
		 * Singleton Bean Example:
		 * 		Note : 
		 * 			we have to set value of field only once and each time when we create new reference it points to same object
		 * 
		 * 
			cs1.setMessage("Please Attend Customer-1");
			System.out.println("Customer Service1 : " +cs1.getMessage());
			
			CustomerService cs2 = context.getBean("customerServiceId" ,CustomerService.class);
			System.out.println("Customer Service2 : " +cs2.getMessage());
		*/
		
		
		/*
		 * Multiple bean instances are created here each time
		 * 
		 * 		Note :
		 * 			Whenever we create new instance each time we have to set state(value) of the field explicitely. 
		 * 		 If we fail to do so, it will return null as an output
		 * 
		 */
		cs1.setMessage("Please Attend Customer-1");
		System.out.println("Customer Service1 : " +cs1.getMessage());
		
		CustomerService cs2 = context.getBean("customerServiceId" ,CustomerService.class);
		cs2.setMessage("Please Attend Customer-2"); // if you dont set this state then you will get null output
		System.out.println("Customer Service2 : " +cs2.getMessage());		
		
	}
	
}
