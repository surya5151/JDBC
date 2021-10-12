package com.xworkz.laptop;

import java.sql.SQLException;
import com.xworkz.DAO.LaptopDAO;
import com.xworkz.DAO.LaptopDaoImpl;

public class LaptopTester {
public static void main(String[] args) throws SQLException {
		
		LaptopDAO laptopDAO = new LaptopDaoImpl();
		
//	laptopDAO.saveLaptopRecord();
//	laptopDAO.updateBrand();				
//	laptopDAO.updateBrandAndPrice();
//	laptopDAO.deleteLaptopByID();		
	laptopDAO.readSingleRecordByID();
//	laptopDAO.readAllRecords();
			
//	laptopDAO.readLaptopBrandByID();		
//	laptopDAO.readLaptopColorByID();
//	laptopDAO.readLaptopPriceByID();

}

}
