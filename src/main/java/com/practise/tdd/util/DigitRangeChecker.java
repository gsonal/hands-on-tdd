package com.practise.tdd.util;

import com.practise.tdd.DigitsTextMapper;
import com.practise.tdd.SmallDigitsTextMapper;
import com.practise.tdd.SpecialDigitsTextMapper;
import com.practise.tdd.TenMultiplierDigitsTextMapper;

public class DigitRangeChecker {
	
	public DigitsTextMapper getDigitMapperPerRange(Integer input) {
		if(lessThanTwenty(input)) {
			return new SmallDigitsTextMapper();
		}
		if(lessThanHundred(input) && divisibleByTen(input)) {
			return new TenMultiplierDigitsTextMapper();
		}
		
		if(moreThanThousand(input)) {
			return new SpecialDigitsTextMapper(1000);
		}
		if(moreThanHundred(input)) {
			return new SpecialDigitsTextMapper(100);
		}
		return new SpecialDigitsTextMapper(10);
	}
	
	private boolean lessThanTwenty(Integer number) {
		return number < 20;
	}

	private boolean lessThanHundred(Integer number) {
		return number < 100;
	}
	
	private boolean divisibleByTen(Integer number) {
		return (number % 10 == 0);
	}
	
	private boolean moreThanHundred(Integer number) {
		return number >= 100;
	}
	
	private boolean moreThanThousand(Integer number) {
		return number >= 1000;
	}
	
}
