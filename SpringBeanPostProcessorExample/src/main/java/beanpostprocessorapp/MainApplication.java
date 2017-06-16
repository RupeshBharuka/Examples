package beanpostprocessorapp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
	private static AbstractApplicationContext context;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("SpringBean.xml");

		HelloWorld obj = (HelloWorld) context.getBean("helloWorldId");
		obj.getMessage();
		context.registerShutdownHook();
	}
}
