package com.xworkz.athlete.dto;

import java.io.Serializable;

import com.xworkz.athlete.constants.SPORTS;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*AthleteDTO- id,name,sports,noOfGames,country,level,olympics,age,retired,coachName,
totalMedals,fit,salary


save(dto)
saveList(list)
AthleteDTO findById(int id);
AthleteDTO findByNameAndId
AthleteDTO findByNameAndSports
AthleteDTO findByNameAndCountryAndSports
String findCoachNameByNameAndCountryAndSports
String findNameById
int findIdByName
 */

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class AthleteDTO implements Serializable {
	private int id;
	private String name;
	private String sports;
	private int noOfGames;
	private String country;
	private int level;
	private String olympics;
	private int age;
	private String retired;
	private String coachName;
	private int totalMedals;
	private String fit;
	private long salary;
	
	
	

}
