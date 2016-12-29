package com.practise.tdd.util;

import static com.practise.tdd.common.NumberComparisons.lessThanTwenty;
import static com.practise.tdd.common.NumberComparisons.lessThanHundred;
import static com.practise.tdd.common.NumberComparisons.moreThanHundred;
import static com.practise.tdd.common.NumberComparisons.moreThanThousand;

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
	
	private boolean divisibleByTen(Integer number) {
		return (number % 10 == 0);
	}
	
	
	
}
