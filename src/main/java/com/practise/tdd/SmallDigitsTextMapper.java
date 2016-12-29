package com.practise.tdd;

import java.util.HashMap;

public class SmallDigitsTextMapper extends DigitsTextMapper {

	@Override
	protected SmallDigitsTextMapper initialize() {
		digitToWordsMap = new HashMap<>();
		digitToWordsMap.put(new Integer(0), "zero");
		digitToWordsMap.put(new Integer(1), "one");
		digitToWordsMap.put(new Integer(2), "two");
		digitToWordsMap.put(new Integer(3), "three");
		digitToWordsMap.put(new Integer(4), "four");
		digitToWordsMap.put(new Integer(5), "five");
		digitToWordsMap.put(new Integer(6), "six");
		digitToWordsMap.put(new Integer(7), "seven");
		digitToWordsMap.put(new Integer(8), "eight");
		digitToWordsMap.put(new Integer(9), "nine");
		digitToWordsMap.put(new Integer(10), "ten");
		digitToWordsMap.put(new Integer(11), "eleven");
		digitToWordsMap.put(new Integer(12), "twelve");
		digitToWordsMap.put(new Integer(13), "thirteen");
		digitToWordsMap.put(new Integer(14), "fourteen");
		digitToWordsMap.put(new Integer(15), "fifteen");
		digitToWordsMap.put(new Integer(16), "sixteen");
		digitToWordsMap.put(new Integer(17), "seventeen");
		digitToWordsMap.put(new Integer(18), "eighteen");
		digitToWordsMap.put(new Integer(19), "nineteen");
		return this;
	}

}
