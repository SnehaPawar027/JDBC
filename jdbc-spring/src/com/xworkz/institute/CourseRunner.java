package com.xworkz.institute;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.institute.dao.CourseDAO;
import com.xworkz.institute.dao.CourseDAOImpl;
import com.xworkz.institute.dto.CourseDTO;
import com.xworkz.institute.service.CourseService;
import com.xworkz.institute.service.CourseServiceImpl;

public class CourseRunner {
	public static void main(String[] args) {

		// CourseDAO courseDAO = new CourseDAOImpl();

		// CourseService courseService = new CourseServiceImpl(courseDAO);

		CourseDTO dto1 = new CourseDTO(1, "Java", 3, 23500.00d, LocalDate.of(2022, 6, 16), true);
		CourseDTO dto2 = new CourseDTO(2, "BootStrack", 2, 1500.00d, LocalDate.of(2022, 6, 16), true);
		CourseDTO dto3 = new CourseDTO(3, "Selenium", 2, 7000.00d, LocalDate.of(2022, 6, 16), true);
		CourseDTO dto4 = new CourseDTO(4, "Dot-Net", 4, 1000.00d, LocalDate.of(2022, 6, 16), true);

		// courseService.validate(dto1);
		// courseService.validate(dto2);
		// courseService.validate(dto3);
		// courseService.validate(dto4);

		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"resource/springInstitute.xml")) {

			CourseService csi = applicationContext.getBean(CourseService.class);
			csi.validate(dto1);

		}

	}
}
