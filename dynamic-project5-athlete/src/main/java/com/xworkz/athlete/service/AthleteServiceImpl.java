package com.xworkz.athlete.service;

import org.springframework.stereotype.Component;

import com.xworkz.athlete.dto.AthleteDTO;

@Component
public class AthleteServiceImpl implements AthleteService {

	@Override
	public boolean saveandvalidate(AthleteDTO dto) {

		if (dto != null) {
			if (dto.getName().length() > 2 && dto.getName().length() < 20) {
				System.out.println("Name is valide");
			} else {
				System.out.println("name is invalide");
				return false;
			}

			if (dto.getAge() > 9 && dto.getAge() < 80) {
				System.out.println("age is valide");
			} else {
				System.out.println("age between 9 to 80");
				return false;
			}

			if (dto.getCountry().length() > 3 && dto.getCountry().length() < 25) {
				System.out.println("Country is valide");
			} else {
				System.out.println("Country name length should be 3 to 25");
				return false;
			}

			if (dto.getState().length() > 3 && dto.getState().length() < 15) {
				System.out.println("State is valide");
			} else {
				System.out.println("State name length should be 3 to 15");
				return false;
			}
			
			if (dto.getCity().length() > 3 && dto.getCity().length() < 10) {
				System.out.println("City is valide");
			} else {
				System.out.println("City name length should be 3 to 10");
				return false;
			}

			if (dto.getSports().length() > 3 && dto.getSports().length() < 20) {
				System.out.println("Sports is valide");
			} else {
				System.out.println("Sports name length should be 3 to 20");
				return false;
			}

		//	if (dto.getDob().> 1942 && dto.getDob().getDayOfYear() < 2012) {
			//	System.out.println("Date of birth is valide");
			//} else {
				//System.out.println("date of birth  should be 1942 to 2012");
			//}

		}
		return true;
	}

}
