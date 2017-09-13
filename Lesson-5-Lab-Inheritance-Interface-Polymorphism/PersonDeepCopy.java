package com.fpp.lesson5;

public class PersonDeepCopy implements Cloneable {
	
	String name;
	ComputerDeepCopy computer;
	
	 
	  public PersonDeepCopy(){
	    
	  }
	  
	
	@Override
	public String toString() {
		return "PersonDeepCopy [name=" + name + ", computer=" + computer + "]";
	}


	public PersonDeepCopy(String name, ComputerDeepCopy computer)
	  {
		  this.name = name;
		  this.computer = computer;
		  
	  }
	  
	  public Object clone() throws CloneNotSupportedException {

		  PersonDeepCopy clone=(PersonDeepCopy)super.clone();
		    
		    return clone;

		  }

}
