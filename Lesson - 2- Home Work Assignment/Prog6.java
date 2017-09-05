package fpp;

import java.util.Arrays;

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
		System.out.println(Arrays.toString(arrayWithoutDuplicate));
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
