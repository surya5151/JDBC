package com.xworkz.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.xworkz.laptop.entity.LaptopEntity;
import com.xworkz.util.ConnectionProvider;

public class LaptopDaoImpl implements LaptopDAO {

	@Override
	public void saveLaptopRecord(LaptopEntity laptopEntity) {

		System.out.println("Invoked saveLaptopRecord");

		//String insertQuery = "INSERT INTO laptop VALUES  (?,?,?,?); ";
		
		String insertQuery1="INSERT laptopdb.laptop VALUES(?,?,?,?,?,?,?,?,?,?);";

		try {
			Connection connection = ConnectionProvider.getConnection();
			// PARSE THE QUARY
			PreparedStatement preparedStatement = connection.prepareStatement(insertQuery1);
			// SET THE VALUES USING SETTER
			preparedStatement.setInt(1, laptopEntity.getID());
			preparedStatement.setString(2, laptopEntity.getBRAND());
			preparedStatement.setString(3, laptopEntity.getCOLOR());
			preparedStatement.setDouble(4, laptopEntity.getPRICE());
			preparedStatement.setInt(5, laptopEntity.getRAM());
			preparedStatement.setInt(6, laptopEntity.getPROCESSOR());
			preparedStatement.setBoolean(7,laptopEntity.isIS_CAMERA_PRESENT());
			preparedStatement.setInt(8, laptopEntity.getSCREEN_SIZE());
			preparedStatement.setInt(9, laptopEntity.getWEIGHT());
			preparedStatement.setBoolean(10,laptopEntity.isIS_CD_SUPPORT());	
			
			preparedStatement.executeUpdate();
			System.out.println("save is done");

		} catch (Exception Exception) {
			System.out.println("inside catch block sql exception");
			System.out.println(Exception.getMessage());
			Exception.printStackTrace();
		}
	}

	@Override
	public void updateBrand(String BRAND) {
		System.out.println("Invoked updateBrand");

		String updateQuery = "update laptop set BRAND=? where ID=10;";

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

		String updateBrandAndPrice = "update laptopdb.laptop set BRAND=?, PRICE=? where ID=11";

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

		String deteOneRow = "delete from laptop where id=?";

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

		String readSingleRecordByID = "select*from laptop where ID=8;";

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

		String readAllRecord = "SELECT * FROM laptop;";

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
