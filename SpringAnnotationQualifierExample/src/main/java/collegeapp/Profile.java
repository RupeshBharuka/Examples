package collegeapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {
	
	/*
	 * If you don't use Qualifier here, it will throw NoUniqueBeanDefinitionException
	 * because multiple beans of same type are created in xml configuration file which will create
	 * confusion as to which one has to inject for the initialization purpose.
	 * 
	 * Note:  If you have 2 different configuration files like one is xml based and another is annotation based
	 *        and both the files have same id and name given to bean 
	 *        		Eg id = "student1" ====> in xml config file
	 *                 name = "student1" ====> in annotation based config file. Name given to @Bean
	 *                 
	 *        Then, it injects both the configuration files but xml is injected first.
	 *  
	 */
	@Autowired
	@Qualifier("student11")	// annotation based config file will be injected
//	@Qualifier("student1") //xml based config file will be injected
	
	private Student student;

	public Profile() {

	}

	public void printRollNumber() {
		System.out.println("Roll No : " + student.getRollNumber());
	}

	public void printName() {
		System.out.println("Name : " + student.getName());
	}
}
