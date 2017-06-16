package com.agsft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new AnnotationConfigApplicationContext(Config.class);
		/*
		 * Method 1 : Annotation based configuration
		*/
		Person person = context.getBean(Person.class);
		System.out.println(person);

		
		
		/*
		 * Method 2: XML based configuration
		*/
		context = new ClassPathXmlApplicationContext("SpringBean.xml");
		person = context.getBean(Person.class);
		System.out.println(person);

	}

}
