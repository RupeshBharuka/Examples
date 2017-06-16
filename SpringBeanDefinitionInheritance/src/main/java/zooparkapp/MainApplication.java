package zooparkapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	private static ApplicationContext context;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("SpringBean.xml");
		Elephant elephant = context.getBean("elephantId", Elephant.class);
		
		System.out.println("\n");
		System.out.println("Animal Name : " +elephant.getAnimalName());
		System.out.println("Animal Age : " +elephant.getAnimalAge());
		System.out.println("Animal Weight : " +elephant.getAnimalWeight());		
		System.out.println("Living Place : " +elephant.getLivingPlace());
		
	}

}
