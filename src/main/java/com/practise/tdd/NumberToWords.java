package com.practise.tdd;

import com.practise.tdd.util.DigitRangeChecker;

public class NumberToWords {

	DigitRangeChecker digitRangeChecker;
	

	public String getTexualRepresentationForNumber(Integer number) {
		return digitRangeChecker.getDigitMapperPerRange(number).getValue(number);
	}

	public void setDigitRangeChecker(DigitRangeChecker digitRangeChecker) {
		this.digitRangeChecker = digitRangeChecker;
	}
	
}
