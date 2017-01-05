package com.practise.tdd.common;

public enum NumberToWordAppenders {
	SPACE(" "),
	AND("and"),
	HUNDRED("hundred"),
	THOUSAND("thousand");
	
	private String value;
	
	private NumberToWordAppenders(String myValue) {
		this.value = myValue;
	}
	
	@Override
	public String toString() {
		return this.value;
	}
}
