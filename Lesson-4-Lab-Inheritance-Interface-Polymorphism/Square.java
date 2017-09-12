package com.fpp;

public class Square extends Rectangle {
	
	public Square(String color,double side)
	{
		super(color,side,side);
	}

	@Override
	public double calculateArea() {
		//Area of Square = side * side
		return super.height * super.width;
	}

	@Override
	public double calculatePerimter() {
		//Area of Square = 4 * side: SINCE BOTH SIDES ARE EQUAL
		return super.height * 4;
	}

}
