package com.practise.tdd;

public class Palindrome {

	public boolean isPalindrome(String inputStr) {
		int strLength = inputStr.length();
		char[] originalStr = inputStr.toCharArray();
		char[] reverseStr = new char[strLength];
		
		for(int i=0, j=strLength; j>0; j--, i++) {
			reverseStr[i] = originalStr[j-1];
		}
		
		String reverseStrVal = new String(reverseStr);
		if(inputStr.equals(reverseStrVal)){
			return true;
		}
		
		return false;
	}
}
