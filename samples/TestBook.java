package com.fpp;

public class TestBook {

	public static void main(String[] args) {
		//Book bk = new Book();
		//book type at compiler and runtime
		Book ebook = new Ebook("java","hrostman",2.0,"pdf");
		//book type at compiler, Ebook at run time
		Book paper = new PaperBook("java","hrostman",2.0,true);
		//book type at compiler, PaperBook at run time
		//print(bk);
		print(ebook);
		print(paper);
	}
 public static void print(Book ob)//super class not subclass
 {
	 System.out.println(ob);
	 ob.read();
	 ob.turning();
 }
}
