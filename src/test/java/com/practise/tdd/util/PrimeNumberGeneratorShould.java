package com.practise.tdd.util;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PrimeNumberGeneratorShould {

	PrimeNumberGenerator primeNumberGenerator;
	
	@Before
	public void doSetup() {
		primeNumberGenerator= new PrimeNumberGenerator();
	}
	
	@Test
	public void return_one_for_one() {
		List<Integer> primeNumbers = primeNumberGenerator.getAllPrimeNumbersLessThanInput(1);
		assertEquals(1, primeNumbers.size());
		assertEquals(new Integer(1), primeNumbers.get(0));
	}
	
	@Test
	public void return_one_two_for_two() {
		List<Integer> primeNumbers = primeNumberGenerator.getAllPrimeNumbersLessThanInput(2);
		assertEquals(2, primeNumbers.size());
		assertEquals(new Integer(1), primeNumbers.get(0));
		assertEquals(new Integer(2), primeNumbers.get(1));
	}
	
	@Test
	public void return_list_of_three_digits_for_three() {
		List<Integer> primeNumbers = primeNumberGenerator.getAllPrimeNumbersLessThanInput(3);
		assertEquals(3, primeNumbers.size());
		assertEquals(new Integer(1), primeNumbers.get(0));
		assertEquals(new Integer(2), primeNumbers.get(1));
		assertEquals(new Integer(3), primeNumbers.get(2));
	}
	
	@Test
	public void return_list_of_three_digits_for_four() {
		List<Integer> primeNumbers = primeNumberGenerator.getAllPrimeNumbersLessThanInput(4);
		assertEquals(3, primeNumbers.size());
		assertEquals(new Integer(1), primeNumbers.get(0));
		assertEquals(new Integer(2), primeNumbers.get(1));
		assertEquals(new Integer(3), primeNumbers.get(2));
	}
	
	@Test
	public void return_list_of_three_digits_for_eleven() {
		List<Integer> primeNumbers = primeNumberGenerator.getAllPrimeNumbersLessThanInput(11);
		assertEquals(6, primeNumbers.size());
		assertEquals(new Integer(7), primeNumbers.get(4));
		assertEquals(new Integer(11), primeNumbers.get(5));
	}
}
