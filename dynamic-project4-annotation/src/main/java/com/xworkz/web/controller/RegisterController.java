package com.xworkz.web.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class RegisterController {
	
	
	public RegisterController() {
		System.out.println("running RegisterController");
	}

	@RequestMapping("/register")
	public String onRegister() {
		System.out.println(" calling onRegister");
		return "Register.jsp";
		
	}
}
