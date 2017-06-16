package com.student.app;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {

	@RequestMapping(value = "/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		// specifying view in constructor
		ModelAndView model = new ModelAndView("AdmissionForm");
		return model;
	}

	/* defaultValue attribute is not working, check it */
	 /*@RequestMapping(value = "/submitAdmissionForm.html", method = RequestMethod.GET) 
	 public ModelAndView submitAdmissionForm(@RequestParam(value = "firstName", defaultValue = "Shubham") String firstName,@RequestParam("lastName") String lastName,
			  @RequestParam("mobileNumber")String mobileNumber){ 
		  
		  //specifying view in constructor
		  ModelAndView model = new ModelAndView("AdmissionSuccess"); 
		  
		  model.addObject("msg","Details Submitted by you :: First Name: " + firstName 
			  + ", Last Name: "+ lastName +", Mobile Number : " +mobileNumber);
	  
		  return model;
	  
	  }
	*/ 

	/*
	 * Instead of taking @RequestParam for each form field individually, We can
	 * take Map also
	 * 
	 */
	@RequestMapping(value = "/submitAdmissionForm.html", method = RequestMethod.GET)
	public ModelAndView submitAdmissionForm(@RequestParam Map<String, String> requestParam) {

		String firstName = requestParam.get("firstName");
		String lastName = requestParam.get("lastName");
		String mobileNumber = requestParam.get("mobileNumber");

		ModelAndView model = new ModelAndView("AdmissionSuccess");

		model.addObject("msg", "Details Submitted by you :: First Name: " + firstName + ", Last Name: " + lastName
				+ ", Mobile Number: " + mobileNumber);

		return model;

	}

}
