package com.practise.tdd.util;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGenerator {

	public List<Integer> getAllPrimeNumbersLessThanInput(int inputValue) {
		List<Integer> allPrimeNumbersUnderInput = new ArrayList<>();
		for(int digit=1; digit<=inputValue; digit++) {
			if(isPrime(digit)) {
				allPrimeNumbersUnderInput.add(digit);
			}
		}
		
		return allPrimeNumbersUnderInput;
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
	
}
