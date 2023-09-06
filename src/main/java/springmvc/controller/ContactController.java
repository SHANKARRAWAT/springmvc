package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller // we use this for making the class as controller and it is similar @component;
public class ContactController {

	@Autowired
	private UserService userService;
	//the common data 
	@ModelAttribute
	public void commonData(Model mv) {
		
		mv.addAttribute("name","shankar");
		mv.addAttribute("degree","B.tech");
		System.out.println("calling common data");
	
	}
	
	
	@RequestMapping("/contact")
	public String showForm() {
	
		return "contact";
	}
	
	// by default  requestmapping takes the control of   get 
	@RequestMapping(path="/processform",method=RequestMethod.POST) 
	public ModelAndView handleprocess(@ModelAttribute User user) {
		//modelAttribute automatically mapp the form fields with user object and place value  user object;
			ModelAndView modelandview=new ModelAndView();
//			modelandview.addObject("user", user);
			
			System.out.println(user);
			this.userService.createUser(user);
			if(user.getName().isBlank()) {
			   
				modelandview.setViewName("redirect:/contact");
				return modelandview;
			}
			System.out.println("data is inserted in table user successfully");
			modelandview.setViewName("success");
			return modelandview;
	         }
	
	
//	@RequestMapping(path="/processform",method=RequestMethod.POST) 
//	public ModelAndView handleprocess(@RequestParam("email") String email,
//			@RequestParam("name") String name,
//			 @RequestParam("password") String password) {
//		
////			System.out.println("email"+email);
////			System.out.println("name"+name);
////			System.out.println("paasword"+password);
//			ModelAndView modelandview=new ModelAndView();
//			
//			User user =new User();
//			user.setEmail(email);
//			user.setName(name);
//			user.setPassword(password);
////			modelandview.addObject("email", email);
////			modelandview.addObject("name", name);
////			modelandview.addObject("psw",password);
//			modelandview.addObject("user", user);
//			System.out.println(user);
//			modelandview.setViewName("success");
//			return modelandview;
//	         }
	
	
}
