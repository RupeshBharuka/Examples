package collegeapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.sun.org.glassfish.gmbal.Description;

/*
 * Annotation based beans can be created in any one of the way,
 *    By using @Configuration 
 *    OR,
 *    By using @Component
 * 
 * */

//@Component
@Configuration
public class StudentConfig {
	
	
	@Bean
	public Profile createProfile()
	{
		return new Profile();
	}
	
	@Bean(name="student11") //customized bean name. Because by default Bean method name is used to set the name of the bean
	@Description("Creates a bean instance and initialize the properties") //Bean description is provided
	public Student createStudent1(){
		Student student1 = new Student();
		student1.setRollNumber(11);
		student1.setName("Rupesh");
		
		return student1;				
	}
	
	@Bean
	public Student createStudent2(){
		Student student2 = new Student();
		student2.setRollNumber(12);
		student2.setName("Sunil");
		
		return student2;				
	}
	
	
	/*
	 * Specifying bean scope
	 * here, we have specified "prototype" as scope so that each time new student instance will get created.
	 * Default scope is "singleton" which returns the same spring instance every time we call the same method
	 *  
	*/
	/*@Bean
	@Scope("prototype")
	public Student createStudent(){
		return new Student();		
	}*/
	
}
