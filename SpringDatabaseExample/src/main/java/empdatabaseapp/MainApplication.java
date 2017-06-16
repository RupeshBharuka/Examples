package empdatabaseapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	private static ApplicationContext ctx;

	public static void main(String[] args) {
	
		ctx = new ClassPathXmlApplicationContext("SpringBean.xml");

		EmployeeDao dao = (EmployeeDao) ctx.getBean("edao");
//		int status = dao.addEmployee(new Employee(4,"shekhar", "Senior Software Engineer", 200000));
//		System.out.println("Insert Employee Status : " +status);
		
		
//		int status = dao.updateEmployee(new Employee(3,"Sonoo","Sr. Java Developer",150000)); 
//	    System.out.println("Update Employee Status : " +status);
		
		Employee emp = new Employee();
		emp.setEmpId(4);
		int status = dao.deleteEmployee(emp);
		System.out.println("Delete Employee Status : " +status);    

	}

}
