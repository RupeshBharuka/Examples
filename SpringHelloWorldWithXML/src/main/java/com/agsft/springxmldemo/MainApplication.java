package com.agsft.springxmldemo;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
	
	final static Logger LOGGER = Logger.getLogger(MainApplication.class);
	private static ApplicationContext context;
	
	public static void main(String[] args) {

		context = new ClassPathXmlApplicationContext("SpringBean.xml", "SpringBean2.xml");
		

//		HelloWorld hRef = (HelloWorld) context.getBean("testName"); //using name attribute of bean
		HelloWorld hRef = (HelloWorld) context.getBean("helloWorldBean"); //using id attribute of bean
		
		
		// The basic configuration logs messages to the standard console
		BasicConfigurator.configure();
		
		LOGGER.debug("Statement before calling displayGreetings() method");
		hRef.displayGreetings();
		LOGGER.info("Statement after successfully calling debug statement");
	
	}
	
}
