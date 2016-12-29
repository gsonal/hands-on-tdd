package com.practise.tdd;

import java.util.HashMap;

public class TenMultiplierDigitsTextMapper extends DigitsTextMapper {

	@Override
	protected TenMultiplierDigitsTextMapper initialize() {
		digitToWordsMap = new HashMap<>();
		digitToWordsMap.put(new Integer(20), "twenty");
		digitToWordsMap.put(new Integer(30), "thirty");
		digitToWordsMap.put(new Integer(40), "fourty");
		digitToWordsMap.put(new Integer(50), "fifty");
		digitToWordsMap.put(new Integer(60), "sixty");
		digitToWordsMap.put(new Integer(70), "seventy");
		digitToWordsMap.put(new Integer(80), "eighty");
		digitToWordsMap.put(new Integer(90), "ninety");
		return this;
	}

}
