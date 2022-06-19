package com.xworkz.interview.bean;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.interview.dto.InterviewDTO;

@Component
@RequestMapping("/")
public class InterviewController {
	
	public InterviewController() {
	System.out.println("Interview controller is Running ");
	}
	
	@RequestMapping("/save")
	public String selectionProcess(InterviewDTO dto,Model model) {
		System.out.println(dto);
		model.addAttribute("process","data saved successfully");
		return "Interview.jsp" ;
		
	}

	@RequestMapping("/clear")
	public String selectionProcess(Model model) {
		model.addAttribute("information"," ");
		return "Interview.jsp" ;
		
	}
}
