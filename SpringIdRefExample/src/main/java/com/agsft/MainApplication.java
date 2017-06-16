package com.agsft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
	
	private static ApplicationContext context;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("SchoolAppConfig.xml");
		
		Student sRef = (Student) context.getBean("studentId");
		
		System.out.println(sRef.getStudentAddress().getCityName());
		System.out.println(sRef.getStudentName());
	}
}
