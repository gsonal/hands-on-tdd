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
		int[] primeNumberDivisors = getAllPrimeNumbersLessThanDividend(remainder);
		
		for(int divisorIndex = 0; divisorIndex < primeNumberDivisors.length; divisorIndex++) {
			int currentDivisor = primeNumberDivisors[divisorIndex];
			if(remainder % currentDivisor == 0) {
				remainder = remainder/currentDivisor;
				validDivisors.add(currentDivisor);
			}
		}
		return remainder;
	}
	
	private int[] getAllPrimeNumbersLessThanDividend(int currentDividend) {
		List<Integer> allPrimeNumbersUnderDividend = new ArrayList<>();
		for(int digit=2; digit<=currentDividend; digit++) {
			if(isPrime(digit)) {
				allPrimeNumbersUnderDividend.add(digit);
			}
		}
		
		int[] primes = new int[allPrimeNumbersUnderDividend.size()];
		for(int idx=0; idx < primes.length; idx++) {
			primes[idx] = allPrimeNumbersUnderDividend.get(idx);
		}
		return primes;
	}
	
	
	private boolean isPrime(int input) {
		int midOfInput = input / 2;
		
		for (int count = 2; count <= midOfInput; count++) {
			if (input % count == 0) {
				return false;
			}
		}
		
		return true;
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
