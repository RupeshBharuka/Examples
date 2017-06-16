package com.schoolapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	private static ApplicationContext context;

	public static void main(String[] args) {
	
		context = new ClassPathXmlApplicationContext("SpringBean.xml");
		BooksCategory bc = (BooksCategory) context.getBean("booksCategoryId");
		
		/* 
		 * one way of retrieving information
		 * 
		
		System.out.println("Book category : " +bc.getCategoryName());
		System.out.println("Book Name : "+bc.getBookRef().getBookName());
		System.out.println("Book Price : " +"Rs." +bc.getBookRef().getBookPrice());

		*/
		
		
		/*
		 * 2nd way of retrieving information
		 * by calling toString method
		 * 
		*/
		System.out.println(bc);
	}

}
