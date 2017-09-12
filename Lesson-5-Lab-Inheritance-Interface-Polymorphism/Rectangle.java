package com.fpp;

public class Rectangle extends Shape{
	protected double width;
	protected double height;
	
	public Rectangle(String color,double width,double height)
	{
		super(color);
		this.width = width;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		//Area of Rectangle = width * height
		return width * height;
	}

	@Override
	public double calculatePerimter() {
	//Perimeter of Rectangle = 2 * width + 2 * height
		return (2 * width) + (2 * height);
	}
	

}
