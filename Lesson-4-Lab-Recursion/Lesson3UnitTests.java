package com.fpp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class Lesson3UnitTests {
	
	@Test
	public void testMinChar() {
		MinimumCharacter checkMin = new MinimumCharacter();
		char Ooutput = checkMin.getMinimumCharacter("lukman");
		char Eoutput = 'a';
		assertEquals(Ooutput,Eoutput);
	}
	
	@Test
	public void testPalidorm() {
		StringPalindrome palidrone = new StringPalindrome();
		String Ooutput = palidrone.palindrome("ada");
		String Eoutput = "ada";
		assertEquals(Ooutput,Eoutput);
	}
	@Test
	public void testBinarySearch() {
		
	   int[] integerArray = {4,5,6,8,9,11,12,17,18,20,21,23,25,27,30,31,33};
		RecursiveBinarySearch recursion = new RecursiveBinarySearch();
		int Ooutput = recursion.binarySearch(12, integerArray);
		int Eoutput = 6;
		assertEquals(Ooutput,Eoutput);
	}

	@Test
	public void testBinarySearch2() {
		
	   int[] integerArray = {4,5,6,8,9,11,12,17,18,20,21,23,25,27,30,31,33};
		RecursiveBinarySearch recursion = new RecursiveBinarySearch();
		int Ooutput = recursion.binarySearch(10, integerArray);
		int Eoutput = -1;
		assertEquals(Ooutput,Eoutput);
	}
}
