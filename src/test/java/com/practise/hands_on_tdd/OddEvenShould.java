package com.practise.hands_on_tdd;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

public class OddEvenShould {
	OddEven oddEven;
	
	@Before
	public void doSetup() {
		oddEven = new OddEven();
	}
	
	@Test
	public void return_true_for_number_divisible_by_two() {
		assertTrue(oddEven.isEven(2));
	}
	
	@Test
	public void test_return_false_for_number_not_divisible_by_two() {
		assertFalse(oddEven.isEven(1));
	}
	
	@Test
	public void test_return_true_for_zero() {
		assertTrue(oddEven.isEven(0));
	}
}
