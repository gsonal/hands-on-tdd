package com.practise.tdd;

import static com.practise.tdd.common.NumberComparisons.lessThanEqualToTwenty;
import static com.practise.tdd.common.NumberToWordAppenders.AND;
import static com.practise.tdd.common.NumberToWordAppenders.HUNDRED;
import static com.practise.tdd.common.NumberToWordAppenders.SPACE;
import static com.practise.tdd.common.NumberToWordAppenders.THOUSAND;

import org.apache.commons.lang3.StringUtils;

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
				appendSpace(numberInWords);
				appendHundredthDigitValue(remainderFromThousand, numberInWords);
		}
	}

	private void appendHundredthDigitValue(Integer number, StringBuilder numberInWords) {
		if(lessThanEqualToTwenty(number)) {
			appendUnitsOrTeensDigitsValue(number, numberInWords);
		} else {
			int numberAtHundredthPlace = number/100;
			numberInWords.append(digitToWordsMap.get(numberAtHundredthPlace));
			numberInWords.append(SPACE).append(HUNDRED);
			
			int remainderFromHundred = number % 100; 
			if(remainderFromHundred != 0) {
					appendSpace(numberInWords);
					appendTensDigitsValue(remainderFromHundred, numberInWords);
			}
		}
	}

	private void appendTensDigitsValue(Integer number, StringBuilder numberInWords) {
		if(lessThanEqualToTwenty(number)) {
			appendUnitsOrTeensDigitsValue(number, numberInWords);
		} else {
			appendTextConnectors(numberInWords);
			int remainderFromTen = number % 10;
			numberInWords.append(digitToWordsMap.get(number - remainderFromTen));
			appendSpace(numberInWords);
			numberInWords.append(digitToWordsMap.get(remainderFromTen));
		}
	}
	
	private void appendUnitsOrTeensDigitsValue(Integer remainder, StringBuilder numberInWords) {
		appendTextConnectors(numberInWords);
		numberInWords.append(digitToWordsMap.get(remainder));
	}

	private void appendTextConnectors(StringBuilder numberInWords) {
		if(StringUtils.isNotEmpty(numberInWords)) {
			numberInWords.append(AND).append(SPACE);
		}
	}
	
	private void appendSpace(StringBuilder numberInWords) {
		numberInWords.append(SPACE);
	}
	
}
