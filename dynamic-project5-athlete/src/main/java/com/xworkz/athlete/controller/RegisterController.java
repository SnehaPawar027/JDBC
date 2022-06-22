package com.xworkz.athlete.controller;

import javax.xml.ws.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.athlete.dto.AthleteDTO;
import com.xworkz.athlete.service.AthleteService;
//import com.xworkz.athlete.service.AthleteServiceImpl;

@Component
@RequestMapping("/")
public class RegisterController {

	
	@Autowired
	AthleteService athleteservice;
	

	@RequestMapping("/register")
	public String onSave(AthleteDTO dto,Model model) {
		System.out.println("Running save method");
		
		boolean save =athleteservice.saveandvalidate(dto);
		
		if(save) {
			System.out.println("data is saved");
			model.addAttribute("data", "Registration is successful");
			return "Athlete.jsp";
		}
		return "Athlete.jsp";

	}

}
