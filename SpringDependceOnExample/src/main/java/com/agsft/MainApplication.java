package com.agsft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
	
	private static ApplicationContext context;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("SpringBean.xml");
		
		Student student = context.getBean("studentId", Student.class);
//		System.out.println(student.getStudId()); //one way 
//		System.out.println(student.getName());  //one way
//		System.out.println(student.getCourse().getCourseName()); //one way of getting course name
//		System.out.println(student.getCourse()); // 2nd way : calling toString() method of course class
		
		
		System.out.println(student); //2nd way : calling toString method of Student class
 
	}
}
