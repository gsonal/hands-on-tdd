package com.practise.tdd;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumberValidator {

	public boolean isPerfectNumber(int number) {
		List<Integer> divisorsOfNumber = getAllDivisors(number);
		
		if(number!= 1 && sumOfDivisorsEqualsNumber(divisorsOfNumber, number))
			return true;
		
		return false;
	}
	
	private List<Integer> getAllDivisors(int dividend) {
		List<Integer> validDivisors = new ArrayList<>();
		validDivisors.add(new Integer(1));
		
		int remainder = dividend;
		while(remainder > 1) {
			remainder = getDivisorsForRemainder(validDivisors, remainder);
		}
		
		return validDivisors;
	}

	private int getDivisorsForRemainder(List<Integer> validDivisors, int remainder) {
		int[] primeNumberDivisors = {2,3,5,7};
		
		for(int divisorIndex = 0; divisorIndex < primeNumberDivisors.length; divisorIndex++) {
			int currentDivisor = primeNumberDivisors[divisorIndex];
			if(remainder % currentDivisor == 0) {
				remainder = remainder/currentDivisor;
				validDivisors.add(currentDivisor);
			}
		}
		return remainder;
	}
	
	
	private boolean sumOfDivisorsEqualsNumber(List<Integer> divisorsOfNumber, int inputNumber) {
		int sumOfdivisors = 0;
		for(Integer divisor : divisorsOfNumber) {
			sumOfdivisors += divisor;
		}
		
		if(sumOfdivisors == inputNumber)
			return true;
		return false;
	}

}
