package com.agsft;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

//@Component

/*
 * If we don't specify package name it will throw an exception
 * because it doesn't find the bean named Employee which we are accessing through 
 * getBean() method
 * 
 */
@ComponentScan(basePackages="app.config") 
@PropertySource("classpath:databaseconfig.properties")
public class MainApplication {

//	private static AbstractApplicationContext context;
	private static AnnotationConfigApplicationContext ctx;

	public static void main(String[] args) {
		
		/*context = new ClassPathXmlApplicationContext("SpringBean.xml");

		Employee e = context.getBean(Employee.class);
		
		System.out.println("Company Name : " +e.getCompany().getCompanyName());
		System.out.println("City : " +e.getAddress().getCity());*/

		
		ctx = new AnnotationConfigApplicationContext();
		ctx.register(MainApplication.class);
        ctx.refresh();
		
		Employee emp = ctx.getBean(Employee.class);
		
		System.out.println("Company Name : " +emp.getCompany().getCompanyName());
		System.out.println("City : " +emp.getAddress().getCity());
		
		/*
		 * Environment is an interface which extends PropertyResolver interface
		 * 
		 * getEnvironment() returns ConfigurableEnvironment(I)
		 * 
		 */
		Environment env = ctx.getEnvironment();
		System.out.println("URL : " +env.getProperty("mysql.url"));
		System.out.println("DB : " +env.getProperty("mysql.db"));
		
		System.out.println("DB : " +emp.getUrl());
		System.out.println("DB : " +emp.getMysqlDB()); 
		
	}

}
