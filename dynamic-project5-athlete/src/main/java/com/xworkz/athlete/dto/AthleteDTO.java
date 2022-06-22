package com.xworkz.athlete.dto;

//import java.time.LocalDate;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class AthleteDTO {

	private String name;
	private int age;
	private String country;
	private String state;
	private String city;
	private String sports;
	private String dob;

	public AthleteDTO() {
		System.out.println("default cont running");
	}
}
