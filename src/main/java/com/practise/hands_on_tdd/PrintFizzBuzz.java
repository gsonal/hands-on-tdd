package com.practise.hands_on_tdd;

public class PrintFizzBuzz {
	
	private static final String FIZZBUZZ = "fizzbuzz";
	private static final String BUZZ = "buzz";
	private static final String FIZZ = "fizz";

	public int printFinalString() {
		int count = 0;
		for(int i=0; i<=100; i++) {
			System.out.println("[" + i + "]   :   " + getTextInteger(i));
			count = i;
		}
		return count;
	}

	public String getTextInteger(int input) {
		if((input % 3 == 0) && (input % 5 == 0)) {
			return FIZZBUZZ;
		} else if(input % 5 == 0) {
			return BUZZ;
		} else if(input % 3 == 0) {
			return FIZZ;
		}
		return String.valueOf(input);
	}

}
