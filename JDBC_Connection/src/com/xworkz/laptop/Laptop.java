package com.xworkz.laptop;

public class Laptop {
	public String brand;
	public double prize;
	public String color;
	public short ram;
	
	public void compute() {
		System.out.println("Invoke compute() ");
	}
	
	@Deprecated
	public void print() {
		System.out.println("Invoke print() ");
	}

}
