package com.fpp.lesson8;

import java.util.ArrayList;

public class Marketing {
	
	private String  employeeName;
	private String  productName;
	@Override
	public String toString() {
		return "Marketing [employeeName=" + employeeName + ", productName="
				+ productName + ", salesAmount=" + salesAmount + "]";
	}

	private double  salesAmount;
	
	public Marketing(String employeeName, String productName, double salesAmount) {
		this.employeeName = employeeName;
		this.productName = productName;
		this.salesAmount = salesAmount;
	}
	
	public static void main(String[] args) {
		ArrayList<Marketing> markets = new ArrayList<>();
		markets.add(new Marketing("Lukman","Earlier Savings Account",2000));
		markets.add(new Marketing("Stanley","Premium Savings Account",5000));
		markets.add(new Marketing("Samson","Current Account",2000));
		markets.add(new Marketing("Abdallah","Checking Account",9000));
		markets.add(new Marketing("Geeta","Premium Current Account",7000));
		
		System.out.println(markets);
		markets.remove(3);
		
		System.out.println(markets);
		
		markets.set(2, new Marketing("Farah","Earlier Savings Account",2000));
		System.out.println(markets);
		
		System.out.println(markets.size());
	}
	

}
