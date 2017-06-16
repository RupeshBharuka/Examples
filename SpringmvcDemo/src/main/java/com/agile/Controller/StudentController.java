package com.agile.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.agile.Service.StudentService;
import com.agile.model.Student;

@Controller

public class StudentController {
	@Autowired
	StudentService service;
	
	@RequestMapping(value="/studentRegistration", method = RequestMethod.GET)
	public ModelAndView getStudentForm(){
		ModelAndView model = new ModelAndView("StudentForm");
		Student student=new Student();
//		student.setRollNumber(2); //
		student.setFirstName("Rohit");
		student.setLastName("Jannawar");
		student.setCourseName("Spring-Hibernate");
		System.out.println("in controller");
		service.addStudentRecord(student);
		System.out.println("end controller");
		return model;
	}
	
	@RequestMapping(value="/submitStudentDetails.html", method = RequestMethod.POST)
	public ModelAndView submitStudentDetails(){
		ModelAndView model = new ModelAndView("StudentFormSuccess");
		
//		${successMessage}
		model.addObject("successMessage", "Student record added successfully !");
		return model;
	}
	
	
}
