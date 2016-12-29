package com.practise.tdd;

import static com.practise.tdd.common.NumberToWordAppenders.SPACE;

import java.util.HashMap;

public class SpecialDigitsTextMapper extends DigitsTextMapper {

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
		int numberAtOnesPlace = number % 10;
		
		numberInWords.append(digitToWordsMap.get(number - numberAtOnesPlace));
		numberInWords.append(SPACE);
		numberInWords.append(digitToWordsMap.get(numberAtOnesPlace));
		return numberInWords.toString();
	}
}
