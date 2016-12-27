package com.practise.tdd;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumberValidator {

	public boolean isPerfectNumber(int number) {
		List<Integer> divisorsOfNumber = getAllPossibleDivisors(number);
		
		if(sumOfDivisorsEqualsNumber(divisorsOfNumber, number))
			return true;
		
		return false;
	}
	
	private List<Integer> getAllPossibleDivisors(int dividend) {
		List<Integer> validDivisors = new ArrayList<>();
		for(int digit=1; digit < dividend; digit++) {
			if(dividend % digit == 0) {
				validDivisors.add(digit);
			}
		}
		return validDivisors;
	}
	
	private boolean sumOfDivisorsEqualsNumber(List<Integer> divisorsOfNumber, int inputNumber) {
		int sumOfdivisors = 0;
		for(Integer divisor : divisorsOfNumber) {
			sumOfdivisors += divisor;
		}
		
		System.out.println("Sum for input " + inputNumber + " is " + sumOfdivisors);
		if(sumOfdivisors == inputNumber)
			return true;
		return false;
	}

}
