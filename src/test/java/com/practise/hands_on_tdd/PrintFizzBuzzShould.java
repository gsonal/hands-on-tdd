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
	
	@Test
	public void return_buzz_for_divisible_by_five() {
		assertEquals("buzz", printFizzBuzz.getTextInteger(10));
	}
	
	@Test
	public void return_fizzbuzz_for_divisible_by_three_and_five() {
		assertEquals("fizzbuzz", printFizzBuzz.getTextInteger(15));
	}
	
	@Test
	public void return_same_integer_for_everything_else() {
		assertEquals("13", printFizzBuzz.getTextInteger(13));
	}
	
	@Test
	public void print_all_from_1_to_100() {
		assertEquals(100, printFizzBuzz.printFinalString());
	}
	
}
