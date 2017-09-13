package com.fpp.lesson5;

public class Lesson5Program3 {

	public static void main(String[] args) {
		
		Figure[] figures = { new UpwardHat(),new DownwardHat(),new FaceMaker(),new Vertical()};
		printFigures(figures);
		printFiguresWithClassName(figures);

	}
	 public static void printFigures(Figure[] figures)
	 {
		 for (Figure f : figures)
		 {
			f.getFigure();
		 }
	 }
	 
	 public static void printFiguresWithClassName(Figure[] figures)
	 {
		 for (Figure f : figures)
		 {
			// f.getClass().getSimpleName() + f.getFigure();
		 }
	 }

}
/*
 OUTPUT
 ----------------
 
 
 
*/