package com.fpp.lesson5;

public class BasePlusCommisionEmployee extends CommissionEmployee{
	private double baseSalary;

	public double getBaseSalary() {
		return baseSalary;
	}

	@Override
	public String toString() {
		String superData = super.toString();
		return superData + "  BasePlusCommisionEmployee [baseSalary=" + baseSalary + "]";
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public BasePlusCommisionEmployee(String firstName, String lastName, String socialSecurityNumer, double grossSales,
			double commisionRate,double baseSalary) {
		super(firstName, lastName, socialSecurityNumer, grossSales, commisionRate);
		this.baseSalary=baseSalary;
		
	}
	
	@Override
	public double getPaymentAmount() {
		return baseSalary + (super.getGrossSales()   * super.getCommisionRate());
	}

}
