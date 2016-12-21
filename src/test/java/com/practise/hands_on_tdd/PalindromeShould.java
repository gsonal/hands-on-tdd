package com.practise.hands_on_tdd;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PalindromeShould {

	Palindrome palindrome;
	
	@Before
	public void doSetup() {
		palindrome = new Palindrome();
	}
	
	@Test
	public void return_true_for_empty_string() throws Exception {
		assertTrue(palindrome.isPalindrome(""));
	}
	
	@Test
	public void return_true_for_reversible_string() {
		assertTrue(palindrome.isPalindrome("1221"));
	}
	
	@Test
	public void return_false_for_irreversible_string() {
		assertFalse(palindrome.isPalindrome("123"));
	}
}
