	package com.agsft.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CountryController {
	
	@RequestMapping(value="/countryForm.html", method=RequestMethod.GET)
	public ModelAndView getAdmissionForm(){
		ModelAndView model = new ModelAndView("CountryForm");
		return model;		
	}
	
	/*
	 * Note: 
	 * 	Methods which are marked as @ModelAttribute at method level gets call first by SpringMVC
	 *  and then other Request Handler methods will get call 
	 * 
	*/
	@ModelAttribute
	public void addCommonObjects(Model model){
		model.addAttribute("headerMessage", "Country Details :");
	}
	
	@RequestMapping(value="/submitCountryDetails.html", method=RequestMethod.POST)
	public ModelAndView submitCountryDetails(@ModelAttribute("country") Country country){
		ModelAndView model = new ModelAndView("CountryFormSuccess");
		
		//if you add object in this way then you have to access it in your jsp as ${successMessage}
		// key, value combination
//		model.addObject("successMessage", "Country Details Submitted Successfully !");
		return model;
	}
}
