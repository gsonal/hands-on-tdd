package com.practise.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.practise.tdd.util.DigitRangeChecker;

public class NumberToWordsShould {

	NumberToWords numberToWords;

	@Before
	public void doSetup() {
		numberToWords = new NumberToWords();
		numberToWords.setDigitRangeChecker(new DigitRangeChecker());
	}

	@Test
	public void return_zero_for_0() {
		assertEquals("zero", numberToWords.getTexualRepresentationForNumber(new Integer(0)));
	}
	
	@Test
	public void return_twenty_for_20() {
		assertEquals("twenty", numberToWords.getTexualRepresentationForNumber(new Integer(20)));
	}
	
	@Test
	public void return_twenty_one_for_21() {
		assertEquals("twenty one", numberToWords.getTexualRepresentationForNumber(new Integer(21)));
	}
	
	@Test
	public void return_fifty_for_50() {
		assertEquals("fifty", numberToWords.getTexualRepresentationForNumber(new Integer(50)));
	}
	
	@Test
	public void return_ninety_five_for_95() {
		assertEquals("ninety five", numberToWords.getTexualRepresentationForNumber(new Integer(95)));
	}
	
	@Test
	public void return_one_hundred_for_100() {
		assertEquals("one hundred", numberToWords.getTexualRepresentationForNumber(new Integer(100)));
	}
	
	@Test
	public void return_one_hundred_and_one_for_101() {
		assertEquals("one hundred and one", numberToWords.getTexualRepresentationForNumber(new Integer(101)));
	}
	
	@Test
	public void return_two_hundred_and_fifty_five_for_255() {
		assertEquals("two hundred and fifty five", numberToWords.getTexualRepresentationForNumber(new Integer(255)));
	}
	
	@Test
	public void return_nine_hundred_and_ninety_nine_for_999() {
		assertEquals("nine hundred and ninety nine", numberToWords.getTexualRepresentationForNumber(new Integer(999)));
	}
	
	
}
