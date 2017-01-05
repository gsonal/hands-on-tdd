package com.practise.tdd.util;

import static com.practise.tdd.common.NumberComparisons.lessThanHundred;
import static com.practise.tdd.common.NumberComparisons.lessThanTwenty;
import static com.practise.tdd.common.NumberComparisons.moreThanHundred;
import static com.practise.tdd.common.NumberComparisons.moreThanThousand;

import com.practise.tdd.DigitsTextMapper;
import com.practise.tdd.MultipleWordsDigitsTextMapper;

public class DigitRangeChecker {
	
	public DigitsTextMapper getDigitMapperPerRange(Integer input) {
		if(lessThanTwenty(input) ||
				lessThanHundred(input) && divisibleByTen(input)) {
			return new DigitsTextMapper();
		}
		if(moreThanThousand(input)) {
			return new MultipleWordsDigitsTextMapper(1000);
		}
		if(moreThanHundred(input)) {
			return new MultipleWordsDigitsTextMapper(100);
		}
		return new MultipleWordsDigitsTextMapper(10);
	}
	
	private boolean divisibleByTen(Integer number) {
		return (number % 10 == 0);
	}
	
	
	
}
