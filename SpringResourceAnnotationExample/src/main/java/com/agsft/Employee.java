package com.agsft;

import javax.annotation.Resource;

import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:databaseconfig.properties")
public class Employee {

	/*
	 * 
	 * When @Resource is applied on any field or method the container
	 * automatically injects the requested resource
	 * 
	 * Note : 1)@Resource takes a name attribute, and by default Spring
	 * interprets that value as the bean name to be injected. In other words, it
	 * follows by-name semantics
	 * 
	 * 2)The name parameter of @Resource must match the name of bean otherwise
	 * it throws an exception
	 */

	@Resource(name = "company")
	private Company company;

	@Resource(name = "address")
	private Address address;

	//1st approach
	/*@Value("${mysql.url}")
	private String url;

	@Value("${mysql.db}")
	private String mysqlDB;*/
	
	//2nd approach
	@Autowired
	private Environment env;

	public Company getCompany() {
		return company;
	}

	public Address getAddress() {
		return address;
	}

	public String getUrl() {
//		return url; //1st approach using @Value annotation
		return env.getProperty("mysql.url"); //2nd approach using Environment interface which simplifies accessing properties value by removing ${}
		
	}

	public String getMysqlDB() {
//		return mysqlDB; //1st approach using @Value annotation
		return env.getProperty("mysql.db"); //2nd approach using Environment interface which simplifies accessing properties value by removing ${}
	}

}
