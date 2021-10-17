package com.xworkz.DAO;

public interface LaptopDAO {

	void saveLaptopRecord(int ID, String BRAND, String COLOR, double PRICE);

	void updateBrand(String BRAND);

	void updateBrandAndPrice(String BRAND, double PRICE);

	void deleteLaptopByID(int ID);

	void readSingleRecordByID(int ID);

	void readAllRecords(int ID, String BRAND, String Color, double PRICE);

	
}
