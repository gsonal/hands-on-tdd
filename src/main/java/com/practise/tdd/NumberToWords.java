package com.practise.tdd;


import static com.practise.tdd.common.NumberToWordAppenders.SPACE;
import java.util.HashMap;
import java.util.Map;

public class NumberToWords {

	private Map<Integer, String> ones_and_teens = new HashMap<>();
	private Map<Integer, String> tys_multiples_of_ten = new HashMap<>();
	
	NumberToWords() {
		initializeAllMaps();
	}
	
	
	public String getTexualRepresentationForNumber(Integer number) {
		if(lessThanTwenty(number)) {
			return getTextForSingleDigitAndTeens(number);
		}
		if(lessThanHundred(number) && divisibleByTen(number)) {
			 return getTextForMultiplesOfTenWithinHundred(number);
		} else if(lessThanHundred(number) && !divisibleByTen(number)) {
			return getTextForDoubleDigit(number);
		}
		return String.valueOf(number);
	}


	private boolean lessThanTwenty(Integer number) {
		return number < 20;
	}

	private String getTextForMultiplesOfTenWithinHundred(Integer number) {
		return tys_multiples_of_ten.get(number);
	}

	private boolean divisibleByTen(Integer number) {
		return (number % 10 == 0);
	}
	
	private boolean lessThanHundred(Integer number) {
		return number < 100;
	}
	
	private String getTextForSingleDigitAndTeens(Integer number) {
		return ones_and_teens.get(number);
	}
	
	private String getTextForDoubleDigit(Integer number) {
		StringBuilder numberInWords = new StringBuilder();
		int numberAtOnesPlace = number % 10;
		
		numberInWords.append(tys_multiples_of_ten.get(number - numberAtOnesPlace));
		numberInWords.append(SPACE);
		numberInWords.append(ones_and_teens.get(numberAtOnesPlace));
		return numberInWords.toString();
	}
	
	private void initializeAllMaps() {
		ones_and_teens.put(new Integer(0), "zero");
		ones_and_teens.put(new Integer(1), "one");
		ones_and_teens.put(new Integer(2), "two");
		ones_and_teens.put(new Integer(3), "three");
		ones_and_teens.put(new Integer(4), "four");
		ones_and_teens.put(new Integer(5), "five");
		ones_and_teens.put(new Integer(6), "six");
		ones_and_teens.put(new Integer(7), "seven");
		ones_and_teens.put(new Integer(8), "eight");
		ones_and_teens.put(new Integer(9), "nine");
		ones_and_teens.put(new Integer(10), "ten");
		ones_and_teens.put(new Integer(11), "eleven");
		ones_and_teens.put(new Integer(12), "twelve");
		ones_and_teens.put(new Integer(13), "thirteen");
		ones_and_teens.put(new Integer(14), "fourteen");
		ones_and_teens.put(new Integer(15), "fifteen");
		ones_and_teens.put(new Integer(16), "sixteen");
		ones_and_teens.put(new Integer(17), "seventeen");
		ones_and_teens.put(new Integer(18), "eighteen");
		ones_and_teens.put(new Integer(19), "nineteen");
		
		tys_multiples_of_ten.put(new Integer(20), "twenty");
		tys_multiples_of_ten.put(new Integer(30), "thirty");
		tys_multiples_of_ten.put(new Integer(40), "fourty");
		tys_multiples_of_ten.put(new Integer(50), "fifty");
		tys_multiples_of_ten.put(new Integer(60), "sixty");
		tys_multiples_of_ten.put(new Integer(70), "seventy");
		tys_multiples_of_ten.put(new Integer(80), "eighty");
		tys_multiples_of_ten.put(new Integer(90), "ninety");
	}
}
