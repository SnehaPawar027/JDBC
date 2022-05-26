package com.xworkz.config.bean;


/*Write a configuration in spring xml to create below beans 

1. ArrayList and add elements 
2.Set and add elements 
3. Map and entries
4.Properties and entries
5.Declare an array 
6. Inner bean tomorrow
7. 5 Implementations of Spring container*/

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConfigurationSpring {

	private ArrayList<String> flowerList;
	private Set<String> sets;
	private Map<String,String> maps;
	private Properties pros;
	
	
	public ConfigurationSpring() {
		System.out.println("Default constructor"+this.getClass().getSimpleName());
	}
	
	
	

	
	
	
	
}
