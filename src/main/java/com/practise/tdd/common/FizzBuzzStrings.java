package com.practise.tdd.common;

public enum FizzBuzzStrings {
	FIZZ("Fizz"),
	BUZZ("Buzz"),
	FIZZBUZZ("FizzBuzz");
	
	private String myValue;

	private FizzBuzzStrings(String value) {
		this.myValue = value;
	}
	
	@Override
	public String toString() {
		return this.myValue;
	}
}
