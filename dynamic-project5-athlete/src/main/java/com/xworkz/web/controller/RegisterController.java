package com.xworkz.web.controller;

import javax.xml.ws.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.athlete.dto.AthleteDTO;
import com.xworkz.athlete.service.AthleteService;
//import com.xworkz.athlete.service.AthleteServiceImpl;

@RequestMapping("/")
public class RegisterController {

	@Autowired
	AthleteService athleteservice;
	AthleteDTO dto;

	@RequestMapping("register")
	public String onSave(Model model) {
		System.out.println("Running save method");
		model.addAttribute("data", "Registration is successful");
		athleteservice.saveandvalidate(dto);
		return "Athlete.jsp";

	}

}
