package com.fpp;

public class PaperBook extends Book{

	private boolean color;
	
	public PaperBook() {
		super("","",0.0);
	
	}

	public PaperBook(String title, String auhtor, double price,boolean color) {
		super(title, auhtor, price);
		this.color = color;
	}

	@Override
	public void read()
	{
		 System.out.println("can read hard copies");
	}
	@Override
	public void turning()
	{
		 System.out.println("can turn manually");
	}

	@Override
	public String toString() {
		String res =super.toString();
		return res + "PaperBook [color=" + color + "]";
	}
}
