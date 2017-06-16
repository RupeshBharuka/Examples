package itembookingapp;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	private static ApplicationContext context;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("SpringBean.xml");
		PaymentGateway pg = context.getBean("paymentGatewayId", PaymentGateway.class);
		
		System.out.println(pg);

	}

}
