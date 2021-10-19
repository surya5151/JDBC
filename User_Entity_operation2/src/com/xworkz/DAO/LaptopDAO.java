package com.xworkz.DAO;

import java.util.List;

import com.xworkz.laptop.entity.LaptopEntity;

public interface LaptopDAO {

	void saveLaptopRecord(LaptopEntity laptopEntity);

	void updateBrand(String BRAND);

	void updateBrandAndPrice(String BRAND, double PRICE);

	void deleteLaptopByID(int ID);

	LaptopEntity readSingleRecordByID();

	List<LaptopEntity> readAllRecords();

}
