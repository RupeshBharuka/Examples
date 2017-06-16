package com.Agilesoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
	private static ApplicationContext context;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		SpringCollectionExample scExample = (SpringCollectionExample) context.getBean("collectionExample");
		
		System.out.println(scExample.getListOfNames());
		System.out.println(scExample.getMap());
	}
}
