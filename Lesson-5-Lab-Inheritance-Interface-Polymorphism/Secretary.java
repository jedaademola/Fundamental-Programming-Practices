package com.fpp.lesson5;

import java.time.LocalDate;

public class Secretary extends DeptEmployee{

	public Secretary(String name, LocalDate hireDate,double salary, double  overtimeHours) {
		super(name, hireDate,salary);
		this.overtimeHours=   overtimeHours;
	}

	@Override
	public double computeSalary() {
	
		return super.computeSalary() + (12 * overtimeHours);
	}

	private double  overtimeHours;

	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}
}
