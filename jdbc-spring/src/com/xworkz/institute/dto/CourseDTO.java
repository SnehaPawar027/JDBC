/*NO Standards : Naming Conventions, format the File 
Pay 50 Rs  
Course : id,name,duration,fees,startDate,free
id > 0
name !=null && name is not empty && min 4 max 30
duration > 0 && less than 6 
fees <50000 && >=0
startDate > 7 days from now 

com.xworkz.institute
CourseRunner
com.xworkz.institute.dto
CourseDTO
com.xworkz.institute.dao
CourseDAO
CourseDAOImpl
com.xworkz.institute.service
CourseService
CourseServiceImpl
com.xworkz.institute.constants
DBConstants */

package com.xworkz.institute.dto;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString

public class CourseDTO implements Serializable {

	private int id;
	private String name;
	private int duration;
	private double fees;
	private LocalDate startDate;
	private boolean free;

}
