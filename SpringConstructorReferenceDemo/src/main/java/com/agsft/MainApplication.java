package com.agsft;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
	
	private static AbstractApplicationContext context;

	public static void main(String[] args) {
	
		context = new ClassPathXmlApplicationContext("SpringBean.xml");
		
		Department departmentRef = (Department) context.getBean("department");
		
		System.out.println("Department Name : " +departmentRef.getDepartmentName());
		System.out.println("Employee Name : " +departmentRef.getEmployeeName());
		
	}
	
}
