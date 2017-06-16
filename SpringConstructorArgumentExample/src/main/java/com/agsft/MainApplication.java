package com.agsft;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
	
	private static AbstractApplicationContext context;

	public static void main(String[] args) {
	
		context = new ClassPathXmlApplicationContext("SpringBean.xml");
		
		// return type of getBean is Object that's why we need to cast the returned object
		Employee eRef = (Employee) context.getBean("employee");
		System.out.println("Employee Name : " +eRef.getEmployeeName());
		
	}
}
