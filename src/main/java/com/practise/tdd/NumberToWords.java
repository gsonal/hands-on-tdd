package com.practise.tdd;

import com.practise.tdd.util.DigitRangeChecker;

public class NumberToWords {

	DigitRangeChecker digitRangeChecker;
	
	NumberToWords() {
		this.digitRangeChecker = new DigitRangeChecker();
	}

	public String getTexualRepresentationForNumber(Integer number) {
		return digitRangeChecker.getDigitMapperPerRange(number).getValue(number);
	}

}
