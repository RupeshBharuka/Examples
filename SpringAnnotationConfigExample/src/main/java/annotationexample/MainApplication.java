package annotationexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		
		HelloWorld helloworld = context.getBean(HelloWorld.class);
		helloworld.setMessage("Good Morning !");
		System.out.println(helloworld.getMessage());
	}

}
