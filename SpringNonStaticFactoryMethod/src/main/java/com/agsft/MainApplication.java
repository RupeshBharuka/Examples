package com.agsft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	private static ApplicationContext context;

	public static void main(String[] args) {
	
		context = new ClassPathXmlApplicationContext("SpringBean.xml");
		A aRef = (A) context.getBean("p");
		
		aRef.print();
	}

}
