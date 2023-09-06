package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// for making controller to a class it make controller of spring
@Controller
public class HomeController {

	
	  
	@RequestMapping("/home")
	public String home(Model model) {
		//Using Model object for passing data
		System.out.print("home");
		 model.addAttribute("name", "Shankar rawat");
		 List<String> friends=new ArrayList<String>();
		  friends.add("shankar");
		  friends.add("manish");
		  friends.add("manoj");
		  System.out.println(friends);
		  model.addAttribute("f", friends);
		  
		return "index";
	}
	

	@RequestMapping("/about")
	public String about() {
    System.out.println("About");
	 return "about";	
	}
	
	
	//using modelandview for passing the data
	@RequestMapping("/help")
	public ModelAndView home() {
		ModelAndView modelandview=new ModelAndView();
		List<Integer> no=new ArrayList<Integer>();
		no.add(1);
		no.add(2);
		no.add(3);
		modelandview.addObject("name", "SANDR");
		modelandview.addObject("roll_no",324);
		modelandview.addObject("number",no);
		
		modelandview.setViewName("help");
		System.out.println("Help page");
		return modelandview;
	}
	
	
}
