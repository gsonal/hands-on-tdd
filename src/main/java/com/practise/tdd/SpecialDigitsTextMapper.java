package com.practise.tdd;

import static com.practise.tdd.common.NumberToWordAppenders.SPACE;
import static com.practise.tdd.common.NumberToWordAppenders.HUNDRED;
import static com.practise.tdd.common.NumberToWordAppenders.AND;
import static com.practise.tdd.common.NumberToWordAppenders.THOUSAND;

import java.util.HashMap;

public class SpecialDigitsTextMapper extends DigitsTextMapper {

	private int multiplier;
	
	public SpecialDigitsTextMapper(int multiplier) {
		super();
		this.multiplier = multiplier;
	}
	
	@Override
	protected DigitsTextMapper initialize() {
		digitToWordsMap = new HashMap<>();
		
		SmallDigitsTextMapper smallDigitsMapper = new SmallDigitsTextMapper();
		digitToWordsMap.putAll(smallDigitsMapper.digitToWordsMap);
		
		TenMultiplierDigitsTextMapper tensDigitsMapper = new TenMultiplierDigitsTextMapper();
		digitToWordsMap.putAll(tensDigitsMapper.digitToWordsMap);
		
		return this;
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
			if(remainderFromThousand < 20) {
				numberInWords.append(SPACE).append(AND).append(SPACE);
				numberInWords.append(digitToWordsMap.get(remainderFromThousand));
			} else if(remainderFromThousand > 10 && remainderFromThousand < 100) {
				numberInWords.append(SPACE).append(AND).append(SPACE);
				appendTensDigitsValue(remainderFromThousand, numberInWords);
			} else if(remainderFromThousand > 100) {
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
			
			if(remainderFromHundred < 20) {
				numberInWords.append(digitToWordsMap.get(remainderFromHundred));
			} else {
				appendTensDigitsValue(remainderFromHundred, numberInWords);
			}
		}
	}

	private void appendTensDigitsValue(Integer number, StringBuilder numberInWords) {
		int numberAtOnesPlace = number % 10;
		numberInWords.append(digitToWordsMap.get(number - numberAtOnesPlace));
		numberInWords.append(SPACE);
		numberInWords.append(digitToWordsMap.get(numberAtOnesPlace));
	}
}
