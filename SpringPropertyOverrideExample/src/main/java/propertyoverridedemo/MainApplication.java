package propertyoverridedemo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
	private static AbstractApplicationContext context;

	public static void main(String[] args) {
	
		context = new ClassPathXmlApplicationContext("SpringBean.xml");
		Person person=(Person)context.getBean("personId");
		
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getLocation());
		
		context.registerShutdownHook();
	}
}
