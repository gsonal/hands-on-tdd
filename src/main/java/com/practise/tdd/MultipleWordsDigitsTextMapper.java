package com.practise.tdd;

import static com.practise.tdd.common.NumberComparisons.lessThanEqualToTwenty;
import static com.practise.tdd.common.NumberComparisons.lessThanHundred;
import static com.practise.tdd.common.NumberComparisons.moreThanHundred;
import static com.practise.tdd.common.NumberComparisons.moreThanTwenty;
import static com.practise.tdd.common.NumberToWordAppenders.AND;
import static com.practise.tdd.common.NumberToWordAppenders.HUNDRED;
import static com.practise.tdd.common.NumberToWordAppenders.SPACE;
import static com.practise.tdd.common.NumberToWordAppenders.THOUSAND;

public class MultipleWordsDigitsTextMapper extends DigitsTextMapper {

	private int multiplier;
	
	public MultipleWordsDigitsTextMapper(int multiplier) {
		super();
		this.multiplier = multiplier;
	}
	
	@Override
	public String getValue(Integer number) {
		StringBuilder numberInWords = new StringBuilder();
		
		if(multiplier == 1000) {
			appendThousandthDigitValue(number, numberInWords);
		} else if(multiplier == 100) {
			appendHundredthDigitValue(number, numberInWords);
		} else if(multiplier == 10) {
			appendTensDigitsValue(number, numberInWords);
		}
		
		return numberInWords.toString();
	}

	private void appendThousandthDigitValue(Integer number, StringBuilder numberInWords) {
		int numberAtThousandthPlace = number/1000;
		numberInWords.append(digitToWordsMap.get(numberAtThousandthPlace));
		numberInWords.append(SPACE).append(THOUSAND);
		
		int remainderFromThousand = number % 1000; 
		if(remainderFromThousand != 0) {
			if(lessThanEqualToTwenty(remainderFromThousand)) {
				numberInWords.append(SPACE).append(AND).append(SPACE);
				numberInWords.append(digitToWordsMap.get(remainderFromThousand));
			} 
			else if(moreThanTwenty(remainderFromThousand) && lessThanHundred(remainderFromThousand)) {
				numberInWords.append(SPACE).append(AND).append(SPACE);
				appendTensDigitsValue(remainderFromThousand, numberInWords);
			} 
			else if(moreThanHundred(remainderFromThousand)) {
				numberInWords.append(SPACE);
				appendHundredthDigitValue(remainderFromThousand, numberInWords);
			} 
		}
	}
	
	private void appendHundredthDigitValue(Integer number, StringBuilder numberInWords) {
		int numberAtHundredthPlace = number/100;
		numberInWords.append(digitToWordsMap.get(numberAtHundredthPlace));
		numberInWords.append(SPACE).append(HUNDRED);
		
		int remainderFromHundred = number % 100; 
		if(remainderFromHundred != 0) {
			numberInWords.append(SPACE).append(AND).append(SPACE);
			
			if(lessThanEqualToTwenty(remainderFromHundred)) {
				numberInWords.append(digitToWordsMap.get(remainderFromHundred));
			} else {
				appendTensDigitsValue(remainderFromHundred, numberInWords);
			}
		}
	}

	private void appendTensDigitsValue(Integer number, StringBuilder numberInWords) {
		int remainderFromTen = number % 10;
		numberInWords.append(digitToWordsMap.get(number - remainderFromTen));
		numberInWords.append(SPACE);
		numberInWords.append(digitToWordsMap.get(remainderFromTen));
	}
}
