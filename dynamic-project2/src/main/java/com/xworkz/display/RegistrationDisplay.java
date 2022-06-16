package com.xworkz.display;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class RegistrationDisplay {
	
	
	public RegistrationDisplay() {
		System.out.println("displaying");
	}
	
	@RequestMapping("/data.dr")
	public String OnDisplay(@RequestParam String firstName,@RequestParam String lastName,Model model ) {
		System.out.println("running display method");
		System.out.println(firstName);
		System.out.println(lastName);
		model.addAttribute("name",firstName+" "+lastName);
		return "Display.jsp";
		
	}

}
