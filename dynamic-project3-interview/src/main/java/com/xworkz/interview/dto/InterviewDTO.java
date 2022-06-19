package com.xworkz.interview.dto;

import lombok.Data;

@Data
public class InterviewDTO {

	public InterviewDTO() {
		System.out.println("Running default construtor ");
	}

	private String round;
	private String company;
	private String venue;
	private double package1;
	private double criteria;
	

}
