package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // it is a specialization of @component 
public class RedirectController {

	@RequestMapping("/one")
	public String one() {
		System.out.println("this is the one");
		return "redirect:/two";
	}
	
	@RequestMapping("/two")
	public String two() {
		System.out.println("this is the two");
		return "redirect:/contact";
		
	}
	
}
