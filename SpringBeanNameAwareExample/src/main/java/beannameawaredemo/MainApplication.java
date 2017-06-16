package beannameawaredemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
	
	private static ApplicationContext context;

	public static void main(String[] args) {
	
		context = new ClassPathXmlApplicationContext("SpringBean.xml");
		
		SimpleCar car = (SimpleCar) context.getBean("simpleCarId");
	    System.out.println("Car Name : " +car.getCarName());
	}		
	
}
