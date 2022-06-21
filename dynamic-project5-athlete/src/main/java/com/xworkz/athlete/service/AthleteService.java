package com.xworkz.athlete.service;

import org.springframework.stereotype.Component;

import com.xworkz.athlete.dto.AthleteDTO;

@Component
public interface AthleteService {

	public boolean saveandvalidate(AthleteDTO dto);

}
