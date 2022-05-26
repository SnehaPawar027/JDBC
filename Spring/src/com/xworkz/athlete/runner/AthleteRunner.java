package com.xworkz.athlete.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.xworkz.athlete.constants.SPORTS;
import com.xworkz.athlete.dao.AthleteDAO;
import com.xworkz.athlete.dao.AthleteDAOImplimentaion;
import com.xworkz.athlete.dto.AthleteDTO;

public class AthleteRunner {

	public static void main(String[] args) {

		AthleteDTO dto = new AthleteDTO(0, "Arun", "RUNNING", 4, "India", 2, "true", 21, "false", "Shree", 3, "true",30l);
        AthleteDTO dto1 = new AthleteDTO(0, "Arjun", "JUMPING", 6, "Japan", 5, "false", 22, "false", "Rajesh", 3,"true", 35l);
        AthleteDTO dto2 = new AthleteDTO(0, "Raghu", "HURDLES", 3, "India", 3, "false", 23, "false", "Ramesh", 4,"true", 30l);
        AthleteDTO dto3 = new AthleteDTO(0, "Jony", "REALY", 2, "Rashya", 4, "true", 18, "false", "Shambu", 2, "true",38l);
        AthleteDTO dto4 = new AthleteDTO(0, "Sonal", "SHOTPUT", 5, "America", 1, "false", 22, "false", "Krishna", 3,"true", 40l);
        AthleteDTO dto5 = new AthleteDTO(0, "Sunny", "THROWING", 8, "India", 3, "true", 23, "false", "Ravi", 5, "true",55l);
   
       
		List<AthleteDTO> list = new ArrayList();
		list.add(dto);
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		list.add(dto4);
		list.add(dto5);

		AthleteDAO dao = new AthleteDAOImplimentaion();
		//dao.saveList(list);

		Optional<AthleteDTO> idDTO = dao.findByID(1);
		System.out.println(idDTO);

		Optional<AthleteDTO> optionalDTO1 = dao.findByID(1);
		if (optionalDTO1.isPresent()) {
			System.out.println(optionalDTO1.get());
		}

		Optional<AthleteDTO> optionalDTO2 = dao.findByNameAndID("Jony", 1);
		if (optionalDTO2.isPresent()) {
			System.out.println(optionalDTO2.get());
		}

		Optional<AthleteDTO> optionalDTO3 = dao.findByNameAndCountryAndSports("Sonal", "America", "SHOTPUT");
		if (optionalDTO3.isPresent()) {
			System.out.println(optionalDTO3.get());
		}

		Optional<AthleteDTO> optionalDTO4 = dao.findByNameAndSports("Sunny", "THROWING");
		if (optionalDTO4.isPresent()) {
			System.out.println(optionalDTO4.get());
		}

		Optional<String> optionalCoach = dao.findCoachNameByNameAndCountryAndSports( "Raghu", "India","HURDLES");
		if (optionalCoach.isPresent()) {
			System.out.println(optionalCoach.get());
		}

		Optional<String> optionalName = dao.findNameByID("Ragu", 1);
		if (optionalName.isPresent()) {
			System.out.println(optionalName.get());
		}

		Optional<Integer> optionalID = dao.findIDByName(1, "Arjun");
		if (optionalID.isPresent()) {
			System.out.println(optionalID.get());
		}

	}

}
