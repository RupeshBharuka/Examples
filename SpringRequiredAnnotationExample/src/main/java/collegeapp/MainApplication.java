package collegeapp;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	private static ApplicationContext context;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("SpringBean.xml");
		Student sRef = context.getBean("studentId", Student.class);
		System.out.println(sRef);
//		System.out.println(sRef.getName());
//		System.out.println(sRef.getAge());		

	}

}
