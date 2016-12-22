package com.practise.hands_on_tdd;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class PrintFizzBuzzShould {

	PrintFizzBuzz printFizzBuzz;
	
	@Before
	public void doSetup() {
		printFizzBuzz =  new PrintFizzBuzz();
	}
	
	@Test
	public void return_fizz_for_divisible_by_three() {
		assertEquals("fizz", printFizzBuzz.getTextInteger(3));
	}
}
