package com.agsft;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.agsft")
public class Config {

	@Bean
	public Person getPerson() {
		return new Person();
	}

	/*
	 * If you don't differentiate between these two beans then it will throw an exception.
	 * That means, it can't identify as to which bean it must refer to.
	 * 
	 * By specifying, @Primary we are giving higher priority to that bean and telling the container 
	 * that refer to this bean first. 
	*/
	
	@Bean
	@Primary
	public Job javaDeveloper() {
		return new Job("Java-Developer");
	}

	@Bean
	public Job frontEndDeveloper() {
		return new Job("Front-end-Developer");
	}
}
