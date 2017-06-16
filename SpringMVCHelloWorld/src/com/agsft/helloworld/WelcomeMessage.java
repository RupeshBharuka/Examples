package com.agsft.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeMessage {
	
	/*
	 * we can have multiple request mappings in same controller
	*/
	
	@RequestMapping("/welcome")
	public ModelAndView welcomeMessage(){
		String message = "Welcome to Spring MVC";
		return new ModelAndView("welcome", "message", message);
	}
	
	/*@RequestMapping("/goodmorning")
	public ModelAndView wecomeMessage2(){
		String message = "Good Morning All !";
		return new ModelAndView("goodmorning", "message", message);
		
	}*/
	
	@RequestMapping("/goodmorning")
	@ResponseBody
	public String wecomeMessage2(){
		return "Good Afternoon !";
	}
}
