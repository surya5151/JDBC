package com.xworkz.laptop;

import java.sql.SQLException;

import com.xworkz.DAO.LaptopDAO;
import com.xworkz.DAO.LaptopDaoImpl;

public class LaptopTester {
	public static void main(String[] args) throws SQLException {

		LaptopDAO laptopDAO = new LaptopDaoImpl();

		// laptopDAO.saveLaptopRecord(9,"Dell_2","cream",45000);

		// laptopDAO.updateBrand("Acer_1");

		// laptopDAO.updateBrandAndPrice("Sony", 50000);

		// laptopDAO.deleteLaptopByID(11);

		// laptopDAO.readSingleRecordByID(1);

		laptopDAO.readAllRecords(1, "", "", 2000);

	}

}
