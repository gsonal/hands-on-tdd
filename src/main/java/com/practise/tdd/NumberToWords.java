package com.practise.tdd;

import java.util.HashMap;
import java.util.Map;

public class NumberToWords {

private Map<Integer, String> ones_and_teens = new HashMap<>();
	
	NumberToWords() {
		initializeAllMaps();
	}
	
	
	public String getTexualRepresentationForNumber(Integer number) {
		if(lessThanHundred(number) && divisibleByTen(number)) {
			 getTextForMultiplesOfTenWithinHundred();
		}
		return getTextForSingleDigitAndTeens(number);
	}

	private String getTextForMultiplesOfTenWithinHundred() {
		return "";
		
	}


	private boolean divisibleByTen(Integer number) {
		return (number % 10 == 0);
	}
	
	private boolean lessThanHundred(Integer number) {
		return number < 100;
	}
	
	private String getTextForSingleDigitAndTeens(Integer number) {
		return ones_and_teens.get(number);
	}
	
	private void initializeAllMaps() {
		ones_and_teens.put(new Integer(0), "zero");
		ones_and_teens.put(new Integer(1), "one");
		ones_and_teens.put(new Integer(2), "two");
		ones_and_teens.put(new Integer(3), "three");
		ones_and_teens.put(new Integer(4), "four");
		ones_and_teens.put(new Integer(5), "five");
		ones_and_teens.put(new Integer(6), "six");
		ones_and_teens.put(new Integer(7), "seven");
		ones_and_teens.put(new Integer(8), "eight");
		ones_and_teens.put(new Integer(9), "nine");
		ones_and_teens.put(new Integer(10), "ten");
		ones_and_teens.put(new Integer(11), "eleven");
		ones_and_teens.put(new Integer(12), "twelve");
		ones_and_teens.put(new Integer(13), "thirteen");
		ones_and_teens.put(new Integer(14), "fourteen");
		ones_and_teens.put(new Integer(15), "fifteen");
		ones_and_teens.put(new Integer(16), "sixteen");
		ones_and_teens.put(new Integer(17), "seventeen");
		ones_and_teens.put(new Integer(18), "eighteen");
		ones_and_teens.put(new Integer(19), "nineteen");
	}
}
