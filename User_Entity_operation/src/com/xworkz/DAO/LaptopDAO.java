package com.xworkz.DAO;

import com.xworkz.laptop.entity.LaptopEntity;

public interface LaptopDAO {

	void saveLaptopRecord(LaptopEntity laptopEntity);

	void updateBrand(String BRAND);

	void updateBrandAndPrice(String BRAND, double PRICE);

	void deleteLaptopByID(int ID);

	void readSingleRecordByID(int ID);

	void readAllRecords(int ID, String BRAND, String Color, double PRICE);

	
}
