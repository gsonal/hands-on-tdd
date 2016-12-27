package com.practise.tdd;

import java.util.Arrays;
import java.util.List;

public class WordCount {

	public String getUnqiueWordsWithCountFromString(String input) {
		String output = "";
		
		
		List<String> uniqueWords = Arrays.asList(input.split(" "));		
		for(String word : uniqueWords) {
			output += word + " 1, ";
		}
		
		return output.substring(0, output.length()-2);
	}	

}
