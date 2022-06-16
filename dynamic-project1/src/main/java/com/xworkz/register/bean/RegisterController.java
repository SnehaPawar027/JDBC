package com.xworkz.register.bean;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")

public class RegisterController {

	public RegisterController() {
		System.out.println("Calling defult consturctor");
	}

	@RequestMapping("/test.egg")
	public String OnClick(@RequestParam int price, @RequestParam int quantity) {

		System.out.println("egg");
		System.out.println(price);
		System.out.println(quantity);

		return "OnLoad.html";

	}
	@RequestMapping("/application.egg")
	public String OnEgg(@RequestParam  String name,@RequestParam String email,@RequestParam int age,@RequestParam String address,@RequestParam String password,@RequestParam String confirmpassword ) {
		System.out.println("on egg method running");
		System.out.println(name);
		System.out.println(email);
		System.out.println(age);
		System.out.println(address);
		System.out.println(password);
		System.out.println(confirmpassword);
		//System.out.println(color);
		return "Success.html";
	}
	
	
	
//	@RequestMapping("/register.egg")
//	public String OnRegister(@RequestParam  String name,@RequestParam String email,@RequestParam int age,@RequestParam String address,@RequestParam String password,@RequestParam String confirmpassword,@RequestParam String color ) {
//		System.out.println("Register form running");
//		System.out.println(name);
//		System.out.println(email);
//		System.out.println(age);
//		System.out.println(address);
//		System.out.println(password);
//		System.out.println(confirmpassword);
//		System.out.println(color);
//		return "Success.html";
//		
//	}

}
