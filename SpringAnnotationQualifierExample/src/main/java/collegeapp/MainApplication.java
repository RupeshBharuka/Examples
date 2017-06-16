package collegeapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	private static ApplicationContext context2;

	public static void main(String[] args) {

//		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
//		
//		Profile profile = (Profile) context.getBean("profile");
//		profile.printRollNumber();
//		profile.printName();

		
		context2 = new AnnotationConfigApplicationContext(StudentConfig.class);
		Profile profile2 = context2.getBean(Profile.class);
		profile2.printRollNumber();
		profile2.printName();
		
	}

}
