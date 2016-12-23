package com.practise.tdd;

import static com.practise.tdd.common.FizzBuzzStrings.BUZZ;
import static com.practise.tdd.common.FizzBuzzStrings.FIZZ;
import static com.practise.tdd.common.FizzBuzzStrings.FIZZBUZZ;
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
	public void return_same_interger_for_one() {
		assertEquals("1", printFizzBuzz.determineFizzBuzz(1));
	}
	
	@Test
	public void return_fizz_for_three() {
		assertEquals(FIZZ.toString(), printFizzBuzz.determineFizzBuzz(3));
	}
	
	@Test
	public void return_fizz_for_divisible_by_three() {
		assertEquals(FIZZ.toString(), printFizzBuzz.determineFizzBuzz(9));
	}
	
	@Test
	public void return_buzz_for_divisible_by_five() {
		assertEquals(BUZZ.toString(), printFizzBuzz.determineFizzBuzz(10));
	}
	
	@Test
	public void return_fizzbuzz_for_divisible_by_three_and_five() {
		assertEquals(FIZZBUZZ.toString(), printFizzBuzz.determineFizzBuzz(15));
	}
	
	@Test
	public void return_same_integer_for_everything_else() {
		assertEquals("13", printFizzBuzz.determineFizzBuzz(13));
	}
	
}
