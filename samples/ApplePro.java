package com.fpp;

public class ApplePro {
	
	String name;
	String model;
	double price;
	
	public ApplePro(String name, String model, double price) {
		this.name = name;
		this.model = model;
		this.price = price;
	}

	@Override
	public String toString() {
		return    name +    " " 
				+ model  + " "
				+ price  + " \n";
	}
	

}
