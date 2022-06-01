package com.xworkz.institute.constants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConstants {
	public static Connection getConnection() throws SQLException {

		return DriverManager.getConnection(MySqlProperties.URL.getVal(), MySqlProperties.USERNAME.getVal(),
				MySqlProperties.PASSWORD.getVal());

	}

}
