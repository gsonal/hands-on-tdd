package com.practise.hands_on_tdd;

public class PrintFizzBuzz {

	public String getTextInteger(int input) {
		if((input % 3 == 0) && (input % 5 == 0)) {
			return "fizzbuzz";
		} else if(input % 5 == 0) {
			return "buzz";
		} else if(input % 3 == 0) {
			return "fizz";
		}
		return String.valueOf(input);
	}

}
