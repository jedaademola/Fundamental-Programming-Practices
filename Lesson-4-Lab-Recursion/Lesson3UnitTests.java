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

}
