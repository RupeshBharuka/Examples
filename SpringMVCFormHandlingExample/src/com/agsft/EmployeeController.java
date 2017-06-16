package com.agsft;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	List<Employee> listOfEmployee;
	
	@RequestMapping("/empform")
	public ModelAndView displayEmployeeForm() {
		return new ModelAndView("empform", "command", new Employee());
	}
	
	
	/*
	 * @ModelAttribute can be used in 2 ways
	 * 		1)First is as a method parameter
	 * 		2)At method level that means before method definition
	 * 			Eg. see SpringMVCModelAttributeExample
	*/
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public ModelAndView saveEmployeeDetails(@ModelAttribute("emp")Employee emp){
				
//		List<Employee> listOfEmployee = new ArrayList<Employee>();
		listOfEmployee = new ArrayList<Employee>();
		System.out.println(emp.getEmployeeId());
		listOfEmployee.add(emp);
		
//		return new ModelAndView("viewemp", "list", listOfEmployee);
//		return new ModelAndView("redirect:/viewemp");
		return new ModelAndView("viewresponse", "message", "Record Saved Successfully !");
	}
	
	@RequestMapping("/viewemp")
	public ModelAndView viewEmployeeDetails(){
		return new ModelAndView("viewemp", "list", listOfEmployee);
	}
}
