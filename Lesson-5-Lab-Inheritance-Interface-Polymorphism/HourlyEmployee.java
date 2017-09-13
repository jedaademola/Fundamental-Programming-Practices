package com.fpp.lesson5;

public class HourlyEmployee extends Employee{
	
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumer,double wage,double hours ) {
		super(firstName, lastName, socialSecurityNumer);
		this.wage= wage;
		this.hours= hours;
	}
	
	@Override
	public String toString() {
		String superData = super.toString();
		return superData + "  HourlyEmployee [wage=" + wage + ", hours=" + hours + "]";
	}

	private double wage ;
	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}
	private double hours;
	
	@Override
	public double getPaymentAmount() {
		return wage * hours;
	}

}
