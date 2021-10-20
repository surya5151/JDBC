package com.xworkz.laptop;

import java.sql.SQLException;
import java.util.List;

import com.xworkz.DAO.LaptopDAO;
import com.xworkz.DAO.LaptopDaoImpl;
import com.xworkz.laptop.entity.LaptopEntity;

public class LaptopTester {
	public static void main(String[] args) throws SQLException {

		LaptopDAO laptopDAO = new LaptopDaoImpl();

		LaptopEntity LaptopEntity = new LaptopEntity(11, "HP_4", "block", 25000, 6, 5, true, 15, 2, false);

		laptopDAO.saveLaptopRecord(LaptopEntity);

		// laptopDAO.updateBrand("Acer_1");

		// laptopDAO.updateBrandAndPrice("Sony", 50000);

		// laptopDAO.deleteLaptopByID(11);

		// laptopDAO.readSingleRecordByID();

		List<LaptopEntity> allRecords = laptopDAO.readAllRecords();

		for (LaptopEntity laptopEntity : allRecords) {
			System.out.println(laptopEntity + "\t");
			System.out.println();

		}

	}

}
