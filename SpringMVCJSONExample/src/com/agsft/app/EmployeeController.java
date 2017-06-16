package com.agsft.app;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
@RequestMapping("employees")
public class EmployeeController {
	/*
	 * Note:
	 * 	Here, you are returning object of type Employee so there should be something which will convert
	 * 	or parse this object into actual output
	 * 
	 * 	For that you have to add JSON jar in POM.xml and if you don't do so it will throw an exception
	*/
//	@RequestMapping("/view")
//	public @ResponseBody Employee getEmployee(){
//		Employee employee = new Employee();
//		employee.setEmpId(2);
//		employee.setEmpName("Anil");
//		return employee;
//	}
	
	
	/*
	 * Method 2nd :
	 * 		using RestController
	 * when we use RestController, there is no need to add @ResponseBody for each method returning a JSON Object
	 * 
	 * use the  
	 * http://localhost:8083/SpringMVCJSONExample/employees/10/Zarine
	*/
	@RequestMapping(value="/{empId}/{name}", method = RequestMethod.GET)
//	@Produces(MediaType.APPLICATION_XML)	// Error???
	public Employee getEmployeeInJSON(@PathVariable int empId, @PathVariable String name){
		Employee employee = new Employee();
		
		employee.setEmpId(empId);
//		employee.setEmpName(name);
		
		return employee;
	}
}



//Maven Dependencies
/*
        <dependency>
 			<groupId>org.glassfish.web</groupId>
			<artifactId>jstl-impl</artifactId>
			<version>1.2</version>
		</dependency>
		
		<dependency>
			<groupId>org.codehaus.jackson</groupId>
			<artifactId>jackson-mapper-asl</artifactId>
			<version>1.9.13</version>
		</dependency>
		
		<dependency>
			<groupId>com.fasterxml.jackson.core</groupId>
			<artifactId>jackson-databind</artifactId>
			<version>2.5.3</version>
		</dependency>

*/

