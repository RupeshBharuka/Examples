package com.studentapp;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;

//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@EnableWebMvc
public class StudentController {
	/*
	 * @InitBinder annotation is used in combination with WebDataBinder class
	 * Here, we have specified the form field name which we don't want to bind with our class field name
	 * see the list of Built-in Property Editor classes in spring doc at Built-in-Property_Editor page no 174
	*/
	@InitBinder
	public void disableSpecificFieldBinding(WebDataBinder binder){
		// you can specify multiple field names in array, if you want to disable multiple form fields,
		// to bind with your class fields	
//		binder.setDisallowedFields(new String[] {"mobileNumber"}); 
		
		//specifying custom format of date to be entered while filling the student form 
		SimpleDateFormat formatDate = new SimpleDateFormat("yyyy**MM**dd");
		
		//registering the CustomDateEditor object with WebDataBinder reference
		//CustomDateEditor is a property editor class
		binder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(formatDate, false));
		
		// StudentNameEditor is a user-defined class
//		binder.registerCustomEditor(String.class, "studentName", new StudentNameEditor());
	}
	
	@RequestMapping(value = "/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		// specifying view name(jsp file) in the constructor of ModelAndView
		return new ModelAndView("AdmissionForm");
	}

	/*
	 * Note: Methods which are marked as @ModelAttribute at method level gets
	 * call first by SpringMVC and then other Request Handler methods will get
	 * call
	 * 
	 */
	@ModelAttribute
	public void addingCommonObject(Model model) {
		model.addAttribute("headerMessage", "PICT College of Engineering, Pune ");
	}

	/*
	 * @ModelAttribute annotation binds all the html form fields with the class
	 * fields automatically
	 * 
	 * Note: If you want to customize the binding for HTML Form you can do that
	 * by writing your own code see method "customBinding" below:
	 */	
	  @RequestMapping(value="/submitAdmissionForm.html", method=RequestMethod.POST) 
	  public ModelAndView submitAdmissionDetails(@ModelAttribute("student") @Valid Student student, BindingResult result){
		  
		  if(result.hasErrors()){
			  // if any error occurs then return the user back on the same page i.e. Admission Page
			  return new ModelAndView("AdmissionForm");
			  
			  // not working, if I am trying to give customized error message
//			  return new ModelAndView("AdmissionForm").addObject("student1", "Error Occurred ! Check your input details...!");
		  }
//		  System.out.println("Binding Result hasErrors() method : " +result.hasErrors());
		  
		  //specifying view name(jsp file) in the constructor of ModelAndView
		  return new ModelAndView("AdmissionSuccess");
	  }
	 

/*	
 * Custom Data Binding, if you want to avoid auto data binding by @ModelAttribute annotation
 * 
 * @RequestMapping(value = "/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView customBinding(@RequestParam("studentName") String studentName,
									  @RequestParam("mobileNumber") String mobileNumber, 
									  @RequestParam("studentDOB") String studentDOB,
									  @RequestParam("listOfStudentSkills") String[] skillsSet) {

		Student student = new Student();

		try {
			student.setStudentName(studentName);
			student.setMobileNumber(Long.parseLong(mobileNumber));

			SimpleDateFormat formatDate = new SimpleDateFormat("yyyy/MM/dd");

			student.setStudentDOB(formatDate.parse(studentDOB));
			
			List<String> listOfSkills = new ArrayList<>();
			
			for(String skill : skillsSet){
				listOfSkills.add(skill);
			}
				
			student.setListOfStudentSkills(listOfSkills);
		
		} catch (ParseException e) {
			e.printStackTrace();
		}

		// specifying view name(jsp file) in the constructor of ModelAndView
		ModelAndView model = new ModelAndView("AdmissionSuccess"); 
		
		1st parameter is a name by which we will access the fields of our class
		model.addObject("student", student);
		return model;

	}//end of customBinding() method
*/
}
