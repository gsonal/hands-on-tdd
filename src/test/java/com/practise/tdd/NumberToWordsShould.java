package com.practise.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class NumberToWordsShould {

	NumberToWords numberToWords;

	@Before
	public void doSetup() {
		numberToWords = new NumberToWords();
	}

	@Test
	public void return_zero_for_0() {
		assertEquals("zero", numberToWords.getTexualRepresentationForNumber(new Integer(0)));
	}
}