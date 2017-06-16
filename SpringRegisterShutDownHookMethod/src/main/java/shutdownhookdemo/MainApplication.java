package shutdownhookdemo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
	private static AbstractApplicationContext context;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("SpringBean.xml");
		Animal animal = context.getBean("animalId", Animal.class);
		
		System.out.println(animal.getAnimalName());
		
		/*
		 * In spring, registerShutdownHook() method is used to shut down IoC container in non-web applications. It shuts down IoC container gracefully. 
		 * In non web based application like desktop application it is required to call registerShutdownHook. 
		 * In our desktop application we need to release all resources used by our spring application. So we need to ensure that after application is finished, 
		 * destroy method on our beans should be called. 
		 * 
		 * In web-based application ApplicationContext already implements code to shut down the IoC container properly. 
		 * 
		 * */
		context.registerShutdownHook(); 
	}
}
