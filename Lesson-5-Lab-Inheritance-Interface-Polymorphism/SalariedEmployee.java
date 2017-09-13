package com.fpp.lesson5;

public class SalariedEmployee  extends Employee{
	
	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumer,double weeklySalary) {
		super(firstName, lastName, socialSecurityNumer);
		this.weeklySalary=  weeklySalary;
	}

	@Override
	public String toString() {
		String superData = super.toString();
		return superData + "  SalariedEmployee [weeklySalary=" + weeklySalary + "]";
	}

	private double weeklySalary;

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	@Override
	public double getPaymentAmount() {
		return weeklySalary;
	}

}
