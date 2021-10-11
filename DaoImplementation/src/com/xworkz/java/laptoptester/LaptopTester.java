package com.xworkz.java.laptoptester;

import java.sql.SQLException;

import com.xworkz.java.laptopdao.LaptopDAO;
import com.xworkz.java.laptopdao.LaptopDaoImpl;

public class LaptopTester {
public static void main(String[] args) throws SQLException {
		
		LaptopDAO laptopDAO = new LaptopDaoImpl();
		
//		laptopDAO.saveLaptopRecord();
//		laptopDAO.updateBrand();				
//		laptopDAO.updateBrandAndPrice();
//		laptopDAO.deleteLaptopByID();		
//		laptopDAO.readSingleRecordByID();
//		laptopDAO.readAllRecords();
//			
		laptopDAO.readLaptopBrandByID();		
//		laptopDAO.readLaptopColorByID();
//		laptopDAO.readLaptopPriceByID();
		
		
		
		
	}

}
