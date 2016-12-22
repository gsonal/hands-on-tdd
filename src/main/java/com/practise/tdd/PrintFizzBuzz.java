package com.practise.tdd;

import static com.practise.tdd.common.FizzBuzzStrings.BUZZ;
import static com.practise.tdd.common.FizzBuzzStrings.FIZZ;
import static com.practise.tdd.common.FizzBuzzStrings.FIZZBUZZ;

public class PrintFizzBuzz {
	
	public String determineFizzBuzz(int input) {
		if((input % 3 == 0) && (input % 5 == 0)) {
			return FIZZBUZZ.toString();
		} else if(input % 5 == 0) {
			return BUZZ.toString();
		} else if(input % 3 == 0) {
			return FIZZ.toString();
		}
		return String.valueOf(input);
	}

}
