package com.xworkz.camera.bean;

import org.springframework.lang.NonNull;

import lombok.Data;

@Data
public class Camera {

	/*
	 * Camera-> add 6 properties, init 3 using single const and 3 using setter
	 * Double,Boolean,Character,Float,BigDecimal StringBuffer --> create three
	 * beans/instances using different constructors
	 */

	@NonNull
	private String company;
	@NonNull
	private String formFactor;
	@NonNull
	private Integer warranty;
	private Double cost;
	private Integer pixels;
	private Double weight;

}
