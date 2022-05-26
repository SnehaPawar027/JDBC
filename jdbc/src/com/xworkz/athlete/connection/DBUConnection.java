package com.xworkz.athlete.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.xworkz.athlete.properties.MySql;

public class DBUConnection {
	public static Connection getConnection() throws SQLException {

	        return DriverManager.getConnection(MySql.URL.getVal(),MySql.USERNAME.getVal(),MySql. PASSWORD.getVal());
		
	}

}