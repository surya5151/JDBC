package com.xworkz.chair;

public class Chair {
	private int NoOflegs;
	private String color;
	private String brand;
	private String size;
	
	public void move() {
		System.out.println("Invoke move() thank you");
		
	}
	
	@Deprecated
	public void sit() {
		System.out.println("Invoke sit()");
	}


}



