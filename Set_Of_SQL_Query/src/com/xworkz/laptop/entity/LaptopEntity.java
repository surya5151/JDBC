package com.xworkz.laptop.entity;

public class LaptopEntity {

	private int ID;

	private String BRAND;

	private String COLOR;

	private double PRICE;

	private int RAM;

	private int PROCESSOR;

	private boolean IS_CAMERA_PRESENT;

	private int SCREEN_SIZE;

	private int WEIGHT;

	private boolean IS_CD_SUPPORT;

	public LaptopEntity(int iD, String bRAND, String cOLOR, double pRICE, int rAM, int pROCESSOR,
			boolean iS_CAMERA_PRESENT, int sCREEN_SIZE, int wEIGHT, boolean iS_CD_SUPPORT) {
		super();
		ID = iD;
		BRAND = bRAND;
		COLOR = cOLOR;
		PRICE = pRICE;
		RAM = rAM;
		PROCESSOR = pROCESSOR;
		IS_CAMERA_PRESENT = iS_CAMERA_PRESENT;
		SCREEN_SIZE = sCREEN_SIZE;
		WEIGHT = wEIGHT;
		IS_CD_SUPPORT = iS_CD_SUPPORT;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getBRAND() {
		return BRAND;
	}

	public void setBRAND(String bRAND) {
		BRAND = bRAND;
	}

	public String getCOLOR() {
		return COLOR;
	}

	public void setCOLOR(String cOLOR) {
		COLOR = cOLOR;
	}

	public double getPRICE() {
		return PRICE;
	}

	public void setPRICE(double pRICE) {
		PRICE = pRICE;
	}

	public int getRAM() {
		return RAM;
	}

	public void setRAM(int rAM) {
		RAM = rAM;
	}

	public int getPROCESSOR() {
		return PROCESSOR;
	}

	public void setPROCESSOR(int pROCESSOR) {
		PROCESSOR = pROCESSOR;
	}

	public boolean isIS_CAMERA_PRESENT() {
		return IS_CAMERA_PRESENT;
	}

	public void setIS_CAMERA_PRESENT(boolean iS_CAMERA_PRESENT) {
		IS_CAMERA_PRESENT = iS_CAMERA_PRESENT;
	}

	public int getSCREEN_SIZE() {
		return SCREEN_SIZE;
	}

	public void setSCREEN_SIZE(int sCREEN_SIZE) {
		SCREEN_SIZE = sCREEN_SIZE;
	}

	public int getWEIGHT() {
		return WEIGHT;
	}

	public void setWEIGHT(int wEIGHT) {
		WEIGHT = wEIGHT;
	}

	public boolean isIS_CD_SUPPORT() {
		return IS_CD_SUPPORT;
	}

	public void setIS_CD_SUPPORT(boolean iS_CD_SUPPORT) {
		IS_CD_SUPPORT = iS_CD_SUPPORT;
	}

	@Override
	public String toString() {
		return "LaptopEntity [ID=" + ID + ", BRAND=" + BRAND + ", COLOR=" + COLOR + ", PRICE=" + PRICE + ", RAM=" + RAM
				+ ", PROCESSOR=" + PROCESSOR + ", IS_CAMERA_PRESENT=" + IS_CAMERA_PRESENT + ", SCREEN_SIZE="
				+ SCREEN_SIZE + ", WEIGHT=" + WEIGHT + ", IS_CD_SUPPORT=" + IS_CD_SUPPORT + "]";
	}

}
