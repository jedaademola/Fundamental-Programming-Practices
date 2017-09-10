package com.fpp;

import java.util.Scanner;

public class RecursiveBinarySearch {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Integer to search:");
		int integerToSearch = input.nextInt();
		
	    int[] integerArray = {4,5,6,8,9,11,12,17,18,20,21,23,25,27,30,31,33};
	    
	    String searchResult = ( binarySearch(integerToSearch,integerArray,0,integerArray.length - 1) > -1)
	    		? "Integer:" + integerToSearch + " Found at position:" 
                        + binarySearch(integerToSearch,integerArray,0,integerArray.length - 1)
                        : "Integer:" + integerToSearch + " not Found in the array!";
                        
        System.out.println(searchResult);
	  
	}
	 public static int binarySearchTwo( int integerToSearch, int[] integerArray )
	 {
		 return 1;
	 }
	
	 public static int binarySearch( int integerToSearch, int[] integerArray, int lowerPoint, int highPoint )
	   {
	       int midPoint;
	       int  retVal;

	       if ( integerArray.length < 1 || lowerPoint > highPoint )
	       {
	          return( -1 );            
	       }
	       else
	       {
	        
	    	   midPoint = (lowerPoint + highPoint)/2;

	          if ( integerToSearch == integerArray[midPoint] )
	          {
	        	  retVal = midPoint;       
	          }
	          else if ( integerToSearch < integerArray[midPoint] )
	          {
	        	  retVal = binarySearch( integerToSearch, integerArray, lowerPoint, midPoint - 1 ); 
	          }
		      else 
	          {
		    	  retVal = binarySearch( integerToSearch, integerArray, midPoint + 1, highPoint );      
	          }

	          return ( retVal );
	       }
	   }

}
