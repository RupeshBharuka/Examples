package pathvariabledemo;

//import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
//@EnableWebMvc
public class CricketPlayerController {
	
	@RequestMapping("/playerdetails/{playername}/{country}")
	public ModelAndView getPlayerDetails(@PathVariable("playername")String playerName, @PathVariable("country")String country){
		ModelAndView model = new ModelAndView("page");
		model.addObject("playerDetails", "Player Name : " +playerName +", Country : " +country);
		return model;
	}
	
	
	/*
	 * Instead of defining new variable for each path variable,
	 * we can use map which is binded with all the path variables
	 * that we have. 
	 * 
	 * Note: 
	 * 	  While using @PathVariable with Map you have to do any one of the one thing given below,
	 * 		1)Either add @EnableWebMvc in your controller class
	 * 		OR
	 * 		2)add <mvc:annotation-driven/> in your dispatcher-servlet config xml
	 * 		  If you are adding <mvc:annotation-driven> then add its corresponding DTD dispatcher-servlet config xml 
	 * 
	*/
	/*@RequestMapping("/playerdetails/{playername}/{country}")
	public ModelAndView getPlayerDetails(@PathVariable Map<String,String> pathVar){
		
		String playerName = pathVar.get("playername");
		String country = pathVar.get("country");
		
		ModelAndView model = new ModelAndView("page");
		
		model.addObject("cricketPlayerDetails", "Player Name : " +playerName +", Country : " +country);
		
		return model;
	}*/
	
}
