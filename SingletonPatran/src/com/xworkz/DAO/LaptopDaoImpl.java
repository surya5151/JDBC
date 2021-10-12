package com.xworkz.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.utill.ConnectionProvider;

public class LaptopDaoImpl implements LaptopDAO {
		
		public void saveLaptopRecord()  {
		System.out.println("Invoked saveLaptopRecord" );
		
		String insertQuery="INSERT INTO laptops2 VALUES  (7,'lenovo','block',45000); ";
	
		try { 		

			Connection connection =	ConnectionProvider.getConnection();			
			
			Statement statement = connection.createStatement();		
			
			statement.executeUpdate(insertQuery);
			
		} catch (Exception Exception) {
			System.out.println("inside catch block sql exception");
			System.out.println(Exception.getMessage());
			Exception.printStackTrace();
		} 				
	}

	@Override
	public void updateBrand() {
		System.out.println("Invoked updateBrand" );
		
		String updateQuery="update laptops2 set BRAND='mackBook2' where ID=10;";
	
		try { 				
			Connection connection =	ConnectionProvider.getConnection();
			
			Statement statement = connection.createStatement();		
			
			statement.executeUpdate(updateQuery);		
								
		} catch (Exception Exception) {
			System.out.println("inside catch block sql exception");
			System.out.println(Exception.getMessage());
			Exception.printStackTrace();
		} 		
		
	}

	@Override   
	public void updateBrandAndPrice() {
		System.out.println("Invoked updateBrandAndPrice" );
		
		String updateBrandAndPrice="update laptops2 set brand='mackbook', PRICE=25000 where ID=10;";
	
		try { 				
			Connection connection =	ConnectionProvider.getConnection();
			
			Statement statement = connection.createStatement();
			
			statement.executeUpdate(updateBrandAndPrice);		
								
		} catch (Exception Exception) {
			System.out.println("inside catch block sql exception");
			System.out.println(Exception.getMessage());
			Exception.printStackTrace();
		} 		
		
	}

	@Override
	public void deleteLaptopByID() {
		System.out.println("Invoked deleteLaptopByID" );	
	
		String deteOneRow ="delete from laptops2 where id=10;";
		
		try { 							
			Connection connection =	ConnectionProvider.getConnection();
			
			Statement statement = connection.createStatement();
			
			statement.executeUpdate(deteOneRow);		
								
		} catch (Exception Exception) {
			System.out.println("inside catch block sql exception");
			System.out.println(Exception.getMessage());
			Exception.printStackTrace();
		} 		
		
	}

	@Override
	public void readSingleRecordByID() {
		System.out.println("Invoked readSingleRecordByID" );
		
		String readSingleRecordByID="select*from laptops2 where id=1;";
		
		try { 				
			
			Connection connection =	ConnectionProvider.getConnection();
			
			Statement statement = connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery(readSingleRecordByID);
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
	public void readAllRecords() {
	System.out.println("Invoked readAllRecords" );
	
		String readAllRecord = "SELECT * FROM laptops2;";
		
		try { 							
			Connection connection =	ConnectionProvider.getConnection();
			
			Statement statement = connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery(readAllRecord);
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
	public void readLaptopBrandByID() {
		System.out.println("Invoked readLaptopBrandByID" );	
				
		String readLaptopBrandByID="select BRAND FROM laptops2 where ID=1; ";
		
		try { 				
			Connection connection =	ConnectionProvider.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet=statement.executeQuery(readLaptopBrandByID);
			resultSet.next();
			System.out.println(resultSet.getNString(1));		
			
		} catch (Exception Exception) {
			System.out.println("inside catch block sql exception");
			System.out.println(Exception.getMessage());
			Exception.printStackTrace();
		} 							
	}

	@Override
	public void readLaptopColorByID() {
		System.out.println("Invoked readLaptopColorByID" );
		
		String readLaptopColorByID="select COLOR FROM laptops2 where ID=1; ";
		
		try { 				
			Connection connection =	ConnectionProvider.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet=statement.executeQuery(readLaptopColorByID);
			resultSet.next();
			System.out.println(resultSet.getNString(1));		
								
		} catch (Exception Exception) {
			System.out.println("inside catch block sql exception");
			System.out.println(Exception.getMessage());
			Exception.printStackTrace();
		} 				
	}

	@Override
	public void readLaptopPriceByID() {
		System.out.println("Invoked readLaptopPriceByID" );	
		
		String readLaptopPriceByID="select PRICE FROM laptops2 where ID=1; ";
	
		try { 				
			Connection connection =	ConnectionProvider.getConnection();
			
			Statement statement= connection.createStatement();
			ResultSet resultSet = statement.executeQuery(readLaptopPriceByID);
			resultSet.next();
			System.out.println(resultSet.getDouble(1));	
								
		} catch (Exception Exception) {
			System.out.println("inside catch block sql exception");
			System.out.println(Exception.getMessage());
			Exception.printStackTrace();
		} 		
	}
}


	