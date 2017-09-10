package com.fpp;

public final class Circle {
	
	
	//PI * radius * radius
	private double radius;
	

	
	public Circle(double _radius)
	{
		this.radius= _radius;
		
	}
	public double getRadius() {
		return radius;
	}


	public double computeArea()
	{
		
		return Math.PI * radius * radius;
	}

}
