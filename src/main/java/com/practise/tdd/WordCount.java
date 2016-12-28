package com.practise.tdd;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCount {

	public Map<String, Integer> getUnqiueWordsWithCount(String input) {
		List<String> allWords = Arrays.asList(input.split(" "));		
		return countUniqueWords(allWords);		
	}
	
	private Map<String, Integer> countUniqueWords(List<String> words) {
		Map<String, Integer> uniqueWordCountMap = new HashMap<>();
		words.forEach(word -> {
			uniqueWordCountMap.put(word, uniqueWordCountMap.getOrDefault(word, 0) + 1);
		});
		
		return uniqueWordCountMap;
	}

}
