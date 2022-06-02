package com.xworkz.institute.service;

import java.time.LocalDate;

import com.xworkz.institute.dao.CourseDAO;
import com.xworkz.institute.dto.CourseDTO;

public class CourseServiceImpl implements CourseService {

	private CourseDAO dao;

	public CourseServiceImpl(CourseDAO dao) {
		this.dao = dao;
	}

	// @Override
	public boolean validate(CourseDTO dto) {

		if (dto != null) {

			if (dto.getId() > 0) {
				System.out.println(" Given id is valid");

			} else {
				System.out.println(" Given id should be greter than 0");
				return false;
			}
			if (dto.getName() != null && !dto.getName().isEmpty() && dto.getName().length() > 3
					&& dto.getName().length() < 30) {
				System.out.println(" Given Name is Valid ");
			} else {
				System.out.println("Given Name is invalid");
				return false;
			}
			if (dto.getDuration() < 6 && dto.getDuration() > 0) {
				System.out.println("course duration is valid");
			} else {
				System.out.println(" course duration is invalid");
				return false;
			}
			if (dto.getFees() < 50000 && dto.getFees() > 0) {
				System.out.println("total fees ");
			} else {
				System.out.println("feess should  in between 0and50000");
				return false;
			}
			if (dto.getStartDate().isAfter(LocalDate.of(2022, 6, 16))) {
				System.out.println("start date is valid");
			} else {
				System.out.println("start date");
				return false;
			}
			boolean ref = dao.Save(dto);
			System.out.println(ref);
			System.out.println("save the data to DataBase " + dto);
		}

		else {
			System.out.println("data valide ");
		}
		return false;
	}

}
