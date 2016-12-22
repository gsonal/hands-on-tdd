package com.practise.tdd;

public class PrintFizzBuzzForAllNumbers {

	public static void main(String[] args) {
		printFinalStringForOneToHundred();
	}

	public static void printFinalStringForOneToHundred() {
		PrintFizzBuzz printFizzBuzz = new PrintFizzBuzz(); 
		for(int i=0; i<=100; i++) {
			System.out.println("[" + i + "]   :   " + printFizzBuzz.determineFizzBuzz(i));
		}
	}
}
