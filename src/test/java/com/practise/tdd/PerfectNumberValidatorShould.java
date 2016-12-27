package com.practise.tdd;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.practise.tdd.util.PrimeNumberGenerator;

public class PerfectNumberValidatorShould {

	PerfectNumberValidator perfectNumberValidator;
	
	@Before
	public void doSetup() {
		perfectNumberValidator = new PerfectNumberValidator();
		perfectNumberValidator.setPrimeNumberGenerator(new PrimeNumberGenerator());
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
	
	@Test
	public void return_false_for_number_seven(){
		assertFalse(perfectNumberValidator.isPerfectNumber(7));
	}
	
	@Test
	public void return_false_for_number_eleven(){
		assertFalse(perfectNumberValidator.isPerfectNumber(11));
	}
	
}
