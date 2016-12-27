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
			int[] primeNumberDivisors = {2,3,5,7};
			
			for(int divisorIndex = 0; divisorIndex < primeNumberDivisors.length; divisorIndex++) {
				if(remainder % primeNumberDivisors[divisorIndex] == 0) {
					remainder = remainder/primeNumberDivisors[divisorIndex];
					validDivisors.add(primeNumberDivisors[divisorIndex]);
				}
			}
		}
		
		return validDivisors;
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
