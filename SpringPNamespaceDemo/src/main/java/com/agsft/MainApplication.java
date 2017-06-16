package com.agsft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
	private static ApplicationContext context;

	public static void main(String[] args) {
	
		context = new ClassPathXmlApplicationContext("SpringBean.xml");
		Company cRef = (Company) context.getBean("companyId");
		
		System.out.println("Company Name : " +cRef.getCompanyName());
		System.out.println("Company Location : " +cRef.getLocationOfCompany());
		
		Employee eRef = (Employee) context.getBean("employeeId");
		System.out.println("Employee Name : " +eRef.getEmpName());
	}
}
