package com.practise.hands_on_tdd;

public class PrintFizzBuzz {

	public String getTextInteger(int input) {
		if(input % 5 == 0) {
			return "buzz";
		}
		return "fizz";
	}

}
