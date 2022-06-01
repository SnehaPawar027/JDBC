package com.xworkz.institute.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import com.xworkz.institute.constants.DBConstants;
import com.xworkz.institute.dto.CourseDTO;

public class CourseDAOImpl implements CourseDAO {

	// @Override
	public boolean Save(CourseDTO dto) {

		try (Connection connection = DBConstants.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement("Course details are(?,?,?,?,?,?)")) {

			System.out.println(connection);
			preparedStatement.setInt(1, dto.getId());
			preparedStatement.setString(2, dto.getName());
			preparedStatement.setInt(3, dto.getDuration());
			preparedStatement.setDouble(4, dto.getFees());

			preparedStatement.setDate(5, Date.valueOf(dto.getStartDate()));
			preparedStatement.setBoolean(6, dto.isFree());

			int rowsAfeected = preparedStatement.executeUpdate();
			System.out.println(rowsAfeected);
			return true;
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return false;
	}

}
