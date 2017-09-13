package com.fpp.lesson5;

public class CommissionEmployee extends Employee{

	private double grossSales; 
	private double commisionRate;
	
	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommisionRate() {
		return commisionRate;
	}

	public void setCommisionRate(double commisionRate) {
		this.commisionRate = commisionRate;
	}

	public CommissionEmployee(String firstName, String lastName,
			String socialSecurityNumer,double grossSales,double commisionRate) 
	{
		
		super(firstName, lastName, socialSecurityNumer);
		this.grossSales =grossSales;
		this.commisionRate=commisionRate;
		
	}

	@Override
	public String toString() {
		String superData = super.toString();
		return superData +  "CommissionEmployee [grossSales=" + grossSales + ", commisionRate=" + commisionRate + "]";
	}

	@Override
	public double getPaymentAmount() {
		return grossSales * commisionRate;
	}

}
