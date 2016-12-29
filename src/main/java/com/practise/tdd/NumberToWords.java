package com.practise.tdd;

public class NumberToWords {

	public String getTexualRepresentationForNumber(Integer number) {
		
		return getTextForSingleDigitAndTeens(number);
	}

	private String getTextForSingleDigitAndTeens(Integer number) {
		return String.valueOf(number);
	}
	
}
