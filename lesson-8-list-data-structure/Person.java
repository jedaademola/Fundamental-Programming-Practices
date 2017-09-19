package com.fpp.lesson8;

public class Person {
	
	private String lastName;
	private String firstName;
	private int age;
	
	private final int INITIAL_LENGTH = 4;
	private Person[] strArray; 
	private int size;
	
	public Person() {
		strArray = new Person[INITIAL_LENGTH];
		size = 0;
	}
	
	public void add(Person s){
		if(size == strArray.length) resize();
		strArray[size++] = s;
	}
	
	
	public String getLast() // get last name
	{
		for(Person p : strArray){
			if(p.equals(lastName)) return lastName;
		}
	    return "";
	}
	
	public Person get(int i){
		if(i < 0 || i >= size){
			return null;
		}
		return strArray[i];
	}
	
	public boolean find(String s){
		for(Person test : strArray){
			if(test.equals(s)) return true;
		}
		return false;
	}
	
	public void insert(Person s, int pos){
		if(pos > size) return;
		if(pos >= strArray.length||size+1 > strArray.length) {
			resize();
		}
		Person[] temp = new Person[strArray.length+1];
		System.arraycopy(strArray,0,temp,0,pos);
		temp[pos] = s;
		
		System.arraycopy(strArray,pos,temp,pos+1, strArray.length - pos);
		strArray = temp;
		++size;
		
	}
	
	public boolean remove(String s){
		if(size == 0) return false;
		int index = -1;
		for(int i = 0; i < size; ++i ){
			if(strArray[i].equals(s)){
				index = i;
				break;
			}
		}
		if(index==-1) return false;
		Person[] temp = new Person[strArray.length];
		System.arraycopy(strArray,0,temp,0,index);
		System.arraycopy(strArray,index+1,temp,index,strArray.length-(index+1));
		strArray = temp;
		--size;
		return true;
	}
	
	
	private void resize(){
		System.out.println("resizing");
		int len = strArray.length;
		int newlen = 2*len;
		Person[] temp = new Person[newlen];
		System.arraycopy(strArray,0,temp,0,len);
		strArray = temp;
	}
	
	
	@Override
	public String toString() {
	return "Person [lastName=" + lastName + "\n FirstName=" + firstName +
	"\nAge=" + age + "]";
	}
	
	public int size() {
		return size;
	}
	

	public static void main(String[] args) {
		

	}

}
