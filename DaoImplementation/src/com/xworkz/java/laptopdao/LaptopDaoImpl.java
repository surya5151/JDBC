package com.xworkz.java.laptopdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LaptopDaoImpl implements LaptopDAO  {
	public void saveLaptopRecord()  {
		System.out.println("Invoked saveLaptopRecord" );
		
		String url="jdbc:mysql://localhost:3306/laptops";
		String userName="root";
		String password="surya1991";
		
		String insertQuery="INSERT INTO laptops VALUES  (10,'acer2','white',35000); ";
		Connection connection = null;

		try { 				
			connection = DriverManager.getConnection(url, userName, password);
			
			System.out.println("Connection is sucessful "+url);
			
			Statement statement = connection.createStatement();
			
			statement.executeUpdate(insertQuery);		
								
		} catch (Exception Exception) {
			System.out.println("inside catch block sql exception");
			System.out.println(Exception.getMessage());
			Exception.printStackTrace();
		} 		
		finally{
			try {
				if(connection !=null) {
					connection.close();
					System.out.println("connection closed......");
				}else {
					System.out.println("Connection is not closed..!!!!!!!!!!!!");
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}	
			
		}		
			
	}

	@Override
	public void updateBrand() {
		System.out.println("Invoked updateBrand" );
		
		String url="jdbc:mysql://localhost:3306/laptops";
		String userName="root";
		String password="surya1991";

		String updateQuery="update laptops set BRAND='mackBook2' where ID=10;";
		Connection connection = null;

		try { 				
			connection = DriverManager.getConnection(url, userName, password);
			
			System.out.println("Connection is sucessful "+url);
			
			Statement statement = connection.createStatement();
			
			statement.executeUpdate(updateQuery);		
								
		} catch (Exception Exception) {
			System.out.println("inside catch block sql exception");
			System.out.println(Exception.getMessage());
			Exception.printStackTrace();
		} 		
		finally{
			try {
				if(connection !=null) {
					connection.close();
					System.out.println("connection closed......");
				}else {
					System.out.println("Connection is not closed..!!!!!!!!!!!!");
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}				
		}		
	}

	@Override   
	public void updateBrandAndPrice() {
		System.out.println("Invoked updateBrandAndPrice" );
		
		String url="jdbc:mysql://localhost:3306/laptops";
		String userName="root";
		String password="surya1991";

		String updateBrandAndPrice="update laptops set brand='mackbook', PRICE=25000 where ID=10;";
		Connection connection = null;

		try { 				
			connection = DriverManager.getConnection(url, userName, password);
			
			System.out.println("Connection is sucessful "+url);
			
			Statement statement = connection.createStatement();
			
			statement.executeUpdate(updateBrandAndPrice);		
								
		} catch (Exception Exception) {
			System.out.println("inside catch block sql exception");
			System.out.println(Exception.getMessage());
			Exception.printStackTrace();
		} 		
		finally{
			try {
				if(connection !=null) {
					connection.close();
					System.out.println("connection closed......");
				}else {
					System.out.println("Connection is not closed..!!!!!!!!!!!!");
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}				
		}		
	}

	@Override
	public void deleteLaptopByID() {
		System.out.println("Invoked deleteLaptopByID" );
		
		String url="jdbc:mysql://localhost:3306/laptops";
		String userName="root";
		String password="surya1991";

		String deteOneRow ="delete from laptops where id=10;";
		Connection connection = null;

		try { 				
			connection = DriverManager.getConnection(url, userName, password);
			
			System.out.println("Connection is sucessful "+url);
			
			Statement statement = connection.createStatement();
			
			statement.executeUpdate(deteOneRow);		
								
		} catch (Exception Exception) {
			System.out.println("inside catch block sql exception");
			System.out.println(Exception.getMessage());
			Exception.printStackTrace();
		} 		
		finally{
			try {
				if(connection !=null) {
					connection.close();
					System.out.println("connection closed......");
				}else {
					System.out.println("Connection is not closed..!!!!!!!!!!!!");
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}				
		}	
	}

	@Override
	public void readSingleRecordByID() {
		System.out.println("Invoked readSingleRecordByID" );
		
		String url="jdbc:mysql://localhost:3306/laptops";
		String userName="root";
		String password="surya1991";

		String readSingleRecordByID="select*from laptops where id=9;";
		Connection connection = null;

		try { 				
			connection = DriverManager.getConnection(url, userName, password);
			
			System.out.println("Connection is sucessful "+url);
			
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
		finally{
			try {
				if(connection !=null) {
					connection.close();
					System.out.println("connection closed......");
				}else {
					System.out.println("Connection is not closed..!!!!!!!!!!!!");
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}				
		}	
	}

	@Override
	public void readAllRecords() {
	System.out.println("Invoked readAllRecords" );
		
		String url="jdbc:mysql://localhost:3306/laptops";
		String userName="root";
		String password="surya1991";

		String readAllRecord = "SELECT * FROM laptops;";
		Connection connection = null;

		try { 				
			connection = DriverManager.getConnection(url, userName, password);
			
			System.out.println("Connection is sucessful "+url);
			
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
		finally{
			try {
				if(connection !=null) {
					connection.close();
					System.out.println("connection closed......");
				}else {
					System.out.println("Connection is not closed..!!!!!!!!!!!!");
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}				
		}	
	}

	@Override
	public void readLaptopBrandByID() {
		System.out.println("Invoked readLaptopBrandByID" );
		
		String url="jdbc:mysql://localhost:3306/laptops";
		String userName="root";
		String password="surya1991";
		
		String readLaptopBrandByID="select BRAND FROM laptops where ID=9; ";
		Connection connection = null;

		try { 				
			connection = DriverManager.getConnection(url, userName, password);
			
			System.out.println("Connection is sucessful "+url);
			
			Statement statement = connection.createStatement();
			ResultSet resultSet=statement.executeQuery(readLaptopBrandByID);
			resultSet.next();
			System.out.println(resultSet.getNString(1));
			
			
		} catch (Exception Exception) {
			System.out.println("inside catch block sql exception");
			System.out.println(Exception.getMessage());
			Exception.printStackTrace();
		} 		
		finally{
			try {
				if(connection !=null) {
					connection.close();
					System.out.println("connection closed......");
				}else {
					System.out.println("Connection is not closed..!!!!!!!!!!!!");
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}	
			
		}		
			
	}

	@Override
	public void readLaptopColorByID() {
		System.out.println("Invoked readLaptopColorByID" );
		
		String url="jdbc:mysql://localhost:3306/laptops";
		String userName="root";
		String password="surya1991";
		
		String readLaptopColorByID="select COLOR FROM laptops where ID=7; ";
		Connection connection = null;

		try { 				
			connection = DriverManager.getConnection(url, userName, password);
			
			System.out.println("Connection is sucessful "+url);
			
			Statement statement = connection.createStatement();
			ResultSet resultSet=statement.executeQuery(readLaptopColorByID);
			resultSet.next();
			System.out.println(resultSet.getNString(1));
			
								
		} catch (Exception Exception) {
			System.out.println("inside catch block sql exception");
			System.out.println(Exception.getMessage());
			Exception.printStackTrace();
		} 		
		finally{
			try {
				if(connection !=null) {
					connection.close();
					System.out.println("connection closed......");
				}else {
					System.out.println("Connection is not closed..!!!!!!!!!!!!");
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}	
			
		}		
	
		
	}

	@Override
	public void readLaptopPriceByID() {
		System.out.println("Invoked readLaptopPriceByID" );
		
		String url="jdbc:mysql://localhost:3306/laptops";
		String userName="root";
		String password="surya1991";
		
		String readLaptopPriceByID="select PRICE FROM laptops where ID=1; ";
		Connection connection = null;

		try { 				
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/laptops", userName, password);
			
			System.out.println("Connection is sucessful "+url);
			
			Statement statement= connection.createStatement();
			ResultSet resultSet = statement.executeQuery(readLaptopPriceByID);
			resultSet.next();
			System.out.println(resultSet.getDouble(1));
			
								
		} catch (Exception Exception) {
			System.out.println("inside catch block sql exception");
			System.out.println(Exception.getMessage());
			Exception.printStackTrace();
		} 		
		finally{
			try {
				if(connection !=null) {
					connection.close();
					System.out.println("connection closed......");
				}else {
					System.out.println("Connection is not closed..!!!!!!!!!!!!");
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}	
			
		}		
		
		
	}
}



