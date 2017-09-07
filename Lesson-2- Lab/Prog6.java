package com.fpp;

public class Prog6 {

	public static void main(String[] args) {
		String[] arrayWithDuplicate = {"horse", "dog", "cat", "horse","dog"};
		
		String[] arrayWithoutDuplicate = new String[5] ;
		
		int k=0;
		for(String item :arrayWithDuplicate)
		{
		  if (!checkForDuplicate(item,arrayWithoutDuplicate))
		 {
			  arrayWithoutDuplicate[k]= item;
			  ++k;
		 }
			
			
		}
		for(String arrayItem : arrayWithoutDuplicate)
		{
			if (arrayItem != null)System.out.println( arrayItem);
		}
		
	}
	
	public static boolean checkForDuplicate(String item, String[] arr)
	{
		for(String element : arr)
		{
			if (item.equals(element))
				return true;
		}
		
		return false;
	}

}

/*
 horse
 dog
 cat

 */

