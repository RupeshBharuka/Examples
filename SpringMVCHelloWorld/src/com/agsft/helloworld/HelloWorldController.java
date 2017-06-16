package com.agsft.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	
	/*
	 *  "/hello" will be referred by DispatcherServlet while searching for this specific request from jsp
	 */
	@RequestMapping("/hello")
	public ModelAndView helloWorld(){
		String message = "Hello All !";
		
		/* 
		 * here we have passed 3 parameters as 
		 * 	1) View page name which is to be displayed as response
		 * 	2) "message" is name which we will refer to get values in "hellopage" through jstl
		 * 	3) message is actual variable which consist of actual message or text to be displayed
		 * 
		*/
		return new ModelAndView("hellopage", "message", message);
	}
	
}
