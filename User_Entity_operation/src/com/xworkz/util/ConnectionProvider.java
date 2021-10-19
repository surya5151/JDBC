package com.xworkz.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	private static Connection connection = null;

	static {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/laptopdb", "root", "surya1991");
			System.out.println("Connection is sucessful ");
			System.out.println("Connection is Singleton");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static Connection getConnection() {
		System.out.println("Invoked get Connection()");
		if (connection != null) {

			return connection;
		} else {
			System.out.println("Connection is not Created");
			return connection;
		}
	}

	public static void closeConnection() {
		System.out.println("Invoked Close Connection");
		try {
			if (connection != null) {
				connection.close();
				System.out.println("Connection is close");
			} else {
				System.out.println("Connection is not Closed");
			}

		} catch (Exception e) {

		}
	}

}
