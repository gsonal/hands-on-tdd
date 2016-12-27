package com.practise.tdd;

import java.util.ArrayList;
import java.util.List;

import com.practise.tdd.util.PrimeNumberGenerator;

public class PerfectNumberValidator {

	PrimeNumberGenerator primeNumberGenerator;
	
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
		List<Integer> primeNumberDivisors = primeNumberGenerator.getAllPrimeNumbersLessThanInput (remainder);
		primeNumberDivisors.remove(new Integer(1));
		
		for(Integer currentDivisor : primeNumberDivisors) {
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
		
		System.out.println("Sum for input " + inputNumber + " is " + sumOfdivisors);
		if(sumOfdivisors == inputNumber)
			return true;
		return false;
	}

	public void setPrimeNumberGenerator(PrimeNumberGenerator primeNumberGenerator) {
		this.primeNumberGenerator = primeNumberGenerator;
	}
	
}
