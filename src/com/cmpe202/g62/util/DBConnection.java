package com.cmpe202.g62.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnection {
	public static Connection getConnection() throws Exception {
		Connection connection = null;
		Class.forName("org.postgresql.Driver");
		// Get Connection to database
		connection = DriverManager.getConnection("jdbc:postgresql://localhost/cmpe202","pavanibaradi", "postgres");
		return connection;
	}


	public static void close(Connection connection, Statement stmt, ResultSet rs) {

		if (rs != null) {
			try {
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		if (stmt != null) {
			try {
				stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		if (connection != null) {
			try {
				connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
