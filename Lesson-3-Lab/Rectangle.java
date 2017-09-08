package com.fpp;

public final class Rectangle {
	
	private double width;
	private double length;
	
	//width * length
	
	public Rectangle(double _width, double _length)
	{
		this.width= _width;
		this.length=_length;
	}
	
	

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}

	public double computeArea()
	{
		
		return width * length;
	}

	
}
