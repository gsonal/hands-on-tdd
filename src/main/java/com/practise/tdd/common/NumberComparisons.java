package com.practise.tdd.common;

public class NumberComparisons {

	public static boolean lessThanTwenty(Integer number) {
		return number < 20;
	}
	
	public static boolean lessThanEqualToTwenty(Integer number) {
		return number <= 20;
	}
	
	public static boolean moreThanTwenty(Integer number) {
		return number > 20;
	}
	
	public static boolean lessThanHundred(Integer number) {
		return number < 100;
	}
	
	public static boolean moreThanHundred(Integer number) {
		return number >= 100;
	}
	
	public static boolean moreThanThousand(Integer number) {
		return number >= 1000;
	}
	
}
