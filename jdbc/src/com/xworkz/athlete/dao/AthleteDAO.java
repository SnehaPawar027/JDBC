package com.xworkz.athlete.dao;

import java.util.List;
import java.util.Optional;

import com.xworkz.athlete.constants.SPORTS;
import com.xworkz.athlete.dto.AthleteDTO;

public interface AthleteDAO {

	boolean save(AthleteDTO dto);

	boolean saveList(List<AthleteDTO> list);

	default Optional<AthleteDTO> findByID(int id) {
		return null;
	}

	default Optional<AthleteDTO> findByNameAndID(String name, int id) {
		return null;
	}

	default Optional<AthleteDTO> findByNameAndSports(String name, String sports) {
		return null;
	}

	default Optional<AthleteDTO> findByNameAndCountryAndSports(String name, String country, String shotput) {
		return null;
	}

	default Optional<String> findCoachNameByNameAndCountryAndSports(String name, String country, String sports) {
		return null;
	}

	default Optional<String> findNameByID(String name, int id) {
		return null;
	}

	default Optional<Integer> findIDByName(int id, String name) {
		return null;
	}



}
