package com.xworkz.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.xworkz.util.ConnectionProvider;

public class LaptopDaoImpl implements LaptopDAO {

	@Override
	public void saveLaptopRecord(int ID, String BRAND, String COLOR, double PRICE) {

		System.out.println("Invoked saveLaptopRecord");

		String insertQuery = "INSERT INTO laptops2 VALUES  (?,?,?,?); ";

		try {

			Connection connection = ConnectionProvider.getConnection();

			// PARSE THE QUARY
			PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

			// SET THE VALUES USING SETTER
			preparedStatement.setInt(1, ID);
			preparedStatement.setString(2, BRAND);
			preparedStatement.setString(3, COLOR);
			preparedStatement.setDouble(4, PRICE);

			preparedStatement.executeUpdate();

		} catch (Exception Exception) {
			System.out.println("inside catch block sql exception");
			System.out.println(Exception.getMessage());
			Exception.printStackTrace();
		}
	}

	@Override
	public void updateBrand(String BRAND) {
		System.out.println("Invoked updateBrand");

		String updateQuery = "update laptops2 set BRAND=? where ID=10;";

		try {
			Connection connection = ConnectionProvider.getConnection();

			PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);

			preparedStatement.setString(1, BRAND);

			preparedStatement.executeUpdate();

		} catch (Exception Exception) {
			System.out.println("inside catch block sql exception");
			System.out.println(Exception.getMessage());
			Exception.printStackTrace();
		}
	}

	@Override
	public void updateBrandAndPrice(String BRAND, double PRICE) {
		System.out.println("Invoked updateBrandAndPrice");

		String updateBrandAndPrice = "update laptops2.laptops2 set BRAND=?, PRICE=? where ID=11";

		try {
			Connection connection = ConnectionProvider.getConnection();

			PreparedStatement preparedStatement = connection.prepareStatement(updateBrandAndPrice);
			preparedStatement.setString(1, BRAND);
			preparedStatement.setDouble(2, PRICE);

			preparedStatement.executeUpdate();

		} catch (Exception Exception) {
			System.out.println("inside catch block sql exception");
			System.out.println(Exception.getMessage());
			Exception.printStackTrace();
		}
	}

	@Override
	public void deleteLaptopByID(int ID) {
		System.out.println("Invoked deleteLaptopByID");

		String deteOneRow = "delete from laptops2 where id=?";

		try {
			Connection connection = ConnectionProvider.getConnection();

			PreparedStatement preparedStatement = connection.prepareStatement(deteOneRow);
			preparedStatement.setInt(1, ID);
			preparedStatement.executeUpdate();

		} catch (Exception Exception) {
			System.out.println("inside catch block sql exception");
			System.out.println(Exception.getMessage());
			Exception.printStackTrace();
		}
	}

	@Override
	public void readSingleRecordByID(int ID) {
		System.out.println("Invoked readSingleRecordByID");

		String readSingleRecordByID = "select*from laptops2 where ID=8;";

		try {

			Connection connection = ConnectionProvider.getConnection();

			PreparedStatement preparedStatement = connection.prepareStatement(readSingleRecordByID);

			ResultSet resultSet = preparedStatement.executeQuery(readSingleRecordByID);

			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getDouble(4));
				System.out.println(".....................");
			}

		} catch (Exception Exception) {
			System.out.println("inside catch block sql exception");
			System.out.println(Exception.getMessage());
			Exception.printStackTrace();
		}
	}

	@Override
	public void readAllRecords(int ID, String BRAND, String Color, double PRICE) {
		System.out.println("Invoked readAllRecords");

		String readAllRecord = "SELECT * FROM laptops2;";

		try {
			Connection connection = ConnectionProvider.getConnection();

			PreparedStatement preparedStatement = connection.prepareStatement(readAllRecord);

			ResultSet resultSet = preparedStatement.executeQuery(readAllRecord);
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getDouble(4));
				System.out.println(".....................");
			}

		} catch (Exception Exception) {
			System.out.println("inside catch block sql exception");
			System.out.println(Exception.getMessage());
			Exception.printStackTrace();
		}
	}
}
