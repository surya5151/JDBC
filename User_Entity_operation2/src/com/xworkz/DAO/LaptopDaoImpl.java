package com.xworkz.DAO;

import java.sql.Connection;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.xworkz.laptop.entity.LaptopEntity;
import com.xworkz.util.ConnectionProvider;

public class LaptopDaoImpl implements LaptopDAO {

	@Override
	public void saveLaptopRecord(LaptopEntity laptopEntity) {

		System.out.println("Invoked saveLaptopRecord");

		// String insertQuery = "INSERT INTO laptop VALUES (?,?,?,?); ";

		String insertQuery1 = "INSERT laptopdb.laptop VALUES(?,?,?,?,?,?,?,?,?,?);";

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
			preparedStatement.setBoolean(7, laptopEntity.isIS_CAMERA_PRESENT());
			preparedStatement.setInt(8, laptopEntity.getSCREEN_SIZE());
			preparedStatement.setInt(9, laptopEntity.getWEIGHT());
			preparedStatement.setBoolean(10, laptopEntity.isIS_CD_SUPPORT());

			int noOfRowsAffected=preparedStatement.executeUpdate();
			preparedStatement.close();			
			System.out.println(noOfRowsAffected);
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
	public LaptopEntity readSingleRecordByID() {
		System.out.println("Invoked readSingleRecordByID");

		String readSingleRecordByID = "select*from laptop where ID=8;";

		try {

			Connection connection = ConnectionProvider.getConnection();

			PreparedStatement preparedStatement = connection.prepareStatement(readSingleRecordByID);

			ResultSet resultSet = preparedStatement.executeQuery(readSingleRecordByID);

			while (resultSet.next()) {
				int ID = resultSet.getInt(1);
				String BRAND = resultSet.getString(2);
				String COLOR = resultSet.getString(3);
				double PRICE = resultSet.getDouble(4);
				int RAM = resultSet.getInt(5);
				int PROCESSOR = resultSet.getInt(6);
				boolean IS_CAMERA_PRESENT = resultSet.getBoolean(7);
				int SCREEN_SIZE = resultSet.getInt(8);
				int WEIGHT = resultSet.getInt(9);
				boolean IS_CD_SUPPORT = resultSet.getBoolean(10);

				LaptopEntity laptopEntity = new LaptopEntity(ID, BRAND, COLOR, PRICE, RAM, PROCESSOR, IS_CAMERA_PRESENT,
						SCREEN_SIZE, WEIGHT, IS_CD_SUPPORT);
				return laptopEntity;
			}

		} catch (Exception Exception) {
			System.out.println("inside catch block sql exception");
			System.out.println(Exception.getMessage());
			Exception.printStackTrace();
		}
		return null;

	}

	@Override
	public List<LaptopEntity> readAllRecords() {
		System.out.println("Invoked readAllRecords");

		String readAllRecord = "SELECT * FROM laptop;";

		LaptopEntity laptopEntity = null;
		List<LaptopEntity> container = new ArrayList<LaptopEntity>();

		try {
			Connection connection = ConnectionProvider.getConnection();

			PreparedStatement preparedStatement = connection.prepareStatement(readAllRecord);

			ResultSet resultSet = preparedStatement.executeQuery(readAllRecord);
			while (resultSet.next()) {

				int ID = resultSet.getInt(1);
				String BRAND = resultSet.getString(2);
				String COLOR = resultSet.getString(3);
				double PRICE = resultSet.getDouble(4);
				int RAM = resultSet.getInt(5);
				int PROCESSOR = resultSet.getInt(6);
				boolean IS_CAMERA_PRESENT = resultSet.getBoolean(7);
				int SCREEN_SIZE = resultSet.getInt(8);
				int WEIGHT = resultSet.getInt(9);
				boolean IS_CD_SUPPORT = resultSet.getBoolean(10);

				laptopEntity = new LaptopEntity(ID, BRAND, COLOR, PRICE, RAM, PROCESSOR, IS_CAMERA_PRESENT, SCREEN_SIZE,
						WEIGHT, IS_CD_SUPPORT);
				
				container.add(laptopEntity);
			}
			return container;

		} catch (Exception Exception) {
			System.out.println("inside catch block sql exception");
			System.out.println(Exception.getMessage());
			Exception.printStackTrace();
		}
		return container;
	}
}
