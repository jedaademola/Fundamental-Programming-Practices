package com.fpp.lesson8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Marketing {
	
	private String  employeeName;
	private String  productName;
	@Override
	public String toString() {
		return "EmployeeName=" + employeeName + ", ProductName="
				+ productName + ", SalesAmount=" + salesAmount + "\n";
	}

	private double  salesAmount;
	
	public Marketing(String employeeName, String productName, double salesAmount) {
		this.employeeName = employeeName;
		this.productName = productName;
		this.salesAmount = salesAmount;
	}
	
	public static void main(String[] args) {
		ArrayList<Marketing> markets = new ArrayList<>();
		markets.add(new Marketing("Lukman","Earlier Savings Account",200));
		markets.add(new Marketing("Stanley","Premium Savings Account",5000));
		markets.add(new Marketing("Samson","Current Account",2000));
		markets.add(new Marketing("Abdallah","Checking Account",9000));
		markets.add(new Marketing("Geeta","Premium Current Account",7000));
		System.out.println(markets.size());
		System.out.println(markets);
		markets.remove(3);
		
		System.out.println(markets);
		
		markets.set(2, new Marketing("Farah","Earlier Savings Account",15));
		System.out.println(markets);
		
		System.out.println(markets.size());
		
		SaleAmountComparator sales = new SaleAmountComparator();
		Collections.sort(markets, sales);
		System.out.println("After sorting:" + markets);
		
		SaleAmountComparator sales1 = new SaleAmountComparator();
		List<Marketing> newLsit = listMoreThan1000(markets);
		Collections.sort(newLsit, sales1);
		System.out.println("After sorting by  $1000 or more:" + newLsit);
		System.out.println(newLsit.size());
	}
	
	public static List<Marketing> listMoreThan1000(List<Marketing> list){
			
		ArrayList<Marketing> marketsMoreThan1000 = new ArrayList<>();
		for(Marketing m: list)
		{
			if(Double.compare(m.salesAmount, 1000) == 1)
				marketsMoreThan1000.add(m);
		}
		
		return marketsMoreThan1000;
	}
	
	
	static class SaleAmountComparator implements Comparator<Marketing>{

		@Override
		public int compare(Marketing o1, Marketing o2) {
			return Double.compare(o1.salesAmount, o2.salesAmount);
		}

	}
}
