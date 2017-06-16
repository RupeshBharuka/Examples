package com.agsft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	private static ApplicationContext context;

	public static void main(String[] args) {
	
		context = new ClassPathXmlApplicationContext("SpringBean.xml");
		
		RequestProcessor rpRef = context.getBean("requestProcessorId", RequestProcessor.class);
		
		rpRef.getRequestValidator();
		rpRef.getRequestValidator().validateRequest("1");
		
		RequestProcessor rpRef2 = context.getBean("requestProcessorId", RequestProcessor.class);
		rpRef2.getRequestValidator();
		rpRef2.getRequestValidator().validateRequest("2");
		
		System.out.println("rpRef1 : " +rpRef);
		System.out.println("rpRef2 : " +rpRef2);
		
	}

}
