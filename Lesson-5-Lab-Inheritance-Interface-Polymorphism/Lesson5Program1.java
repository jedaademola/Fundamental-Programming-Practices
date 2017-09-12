package com.fpp;

public class Lesson5Program1 {

	public static void main(String[] args) {
		
		Shape[] shapes = new Shape[5];
		
		Rectangle rec = new Rectangle("Blue",3.0,5.0);
		Circle  cir = new Circle("Blue",3.0);
		Square sq = new Square("Blue",3.0);
		
		Circle  cir2 = new Circle("Blue",2.0);
		Rectangle rec3 = new Rectangle("Blue",2.0,4.0);
		
		shapes[0]=rec;
		shapes[1]=cir;
		shapes[2]=sq;
		shapes[3]=cir2;
		shapes[4]=rec3;
		
		printTotal(shapes);

	}
	
	public static void printTotal(Shape[] shapes)
	 { 
		double totalArea=0.0;
		double perimeter=0.0;
		
		for(Shape s:shapes)
		{
			totalArea += s.calculateArea();
			perimeter+= s.calculatePerimter();
		}
		System.out.printf("Total area of shapes:%.2f", totalArea);
		System.out.println();
		System.out.printf("Total perimeter of shapes:%.2f", perimeter);
	 } 

}
