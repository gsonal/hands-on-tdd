package com.practise.tdd;

import static org.junit.Assert.assertFalse;

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
		assertFalse(perfectNumberValidator.isPerfectNumber());
	} 
}
