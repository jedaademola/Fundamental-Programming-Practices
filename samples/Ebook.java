package com.fpp;

//inheritance
public class Ebook extends Book{
	private String eType;
	
	public String geteType() {
		return eType;
	}

	public void seteType(String eType) {
		this.eType = eType;
	}

	Ebook()
	{
	//
		super("","",0.0);
	}
	
	public Ebook(String title,String auhtor,double price,String eType)
	{
		//invoke parent class constructor using super class
		super(title,auhtor,price);
		this.eType =eType;
	}

	@Override
	public String toString() {
		String res =super.toString();
		return res + "Ebook [eType=" + eType + "]";
	}
	
	@Override
	public void read()
	{
		 System.out.println("can read through your device");
	}

}
