package com.fpp;

public final class Triangle {
	
	final double HALF = 0.5;
	
	//1/2 * base * height
	
	private double base;
	private double height;
	
	
	public Triangle(double _base, double _height)
	{
		this.base= _base;
		this.height=_height;
	}
		
	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

	public double computeArea()
	{
		return HALF * base * height;
	}


}
