package com.practise.tdd;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PerfectNumberValidatorShould {

	PerfectNumberValidator perfectNumberValidator;
	
	@Before
	public void doSetup() {
		perfectNumberValidator = new PerfectNumberValidator();
	}
	
	@Test
	public void return_false_for_number_one(){
		assertFalse(perfectNumberValidator.isPerfectNumber(1));
	}
	
	@Test
	public void return_false_for_number_four(){
		assertFalse(perfectNumberValidator.isPerfectNumber(4));
	}
	
	@Test
	public void return_true_for_number_six(){
		assertTrue(perfectNumberValidator.isPerfectNumber(6));
	}
}
