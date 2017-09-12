package com.fpp;

public class Circle extends Shape {
	protected double radius;
	
	public Circle(String color,double radius)
	{
		super(color);
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		//Area of Circle = π * r * r
		return Math.PI * radius * radius;
	}

	@Override
	public double calculatePerimter() {
		//Area of Circle = 2 * π * r
		return  2 * Math.PI * radius;
	}

}
