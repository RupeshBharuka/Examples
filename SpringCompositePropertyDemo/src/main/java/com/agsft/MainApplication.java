package com.agsft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	private static ApplicationContext context;

	public static void main(String[] args) {
	
		context = new ClassPathXmlApplicationContext("SpringBean.xml");
		
//		Company company = (Company) context.getBean("companyId"); // one way of doing
		
		/* 
		 * type safety mechanism
		 * no need to cast to specific type
		 * 
		*/
		Company company = context.getBean("companyId", Company.class);
		
		
		System.out.println("Department Name : " +company.getDepartment().getDeptName());
		System.out.println("Employee Name : " +company.getDepartment().getEmployee().getEmpname());
		
	}

}
