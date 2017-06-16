package springinitanddestroycallbacks;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
	
	public static void main(String[] args) {
		
		// ConfigurableApplicationContext is an interface
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
		Calculation cal = context.getBean("calculationId", Calculation.class);
		
		System.out.println(cal);
		
		context.close(); //Close this application context, releasing all resources
		
		System.out.println("After clean up operation");
		System.out.println(cal);
		
	}
}

