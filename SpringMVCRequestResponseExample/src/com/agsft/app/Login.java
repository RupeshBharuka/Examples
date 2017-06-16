package com.agsft.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Login {
	@RequestMapping("/login")
	public ModelAndView acceptLoginDetails(HttpServletRequest request, HttpServletResponse response){
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		if(userName.equalsIgnoreCase("Admin") && password.equals("Admin")){
			String message = "Hello " + userName;
			return new ModelAndView("homepage", "message", message);
		}else{
			return new ModelAndView("errorpage", "message", "Sorry, Username or Password does not exist !");
		}
	}
}
