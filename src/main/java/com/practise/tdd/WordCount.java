package com.practise.tdd;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCount {

	public Map<String, Integer> getUnqiueWordsWithCountFromString(String input) {
		List<String> allWords = Arrays.asList(input.split(" "));		
		return countUniqueWords(allWords);		
	}
	
	private Map<String, Integer> countUniqueWords(List<String> words) {
		Map<String, Integer> uniqueWordCountMap = new HashMap<>();
		words.forEach(word -> {
			if(uniqueWordCountMap.containsKey(word)) {
				Integer existingCount = uniqueWordCountMap.get(word);
				uniqueWordCountMap.put(word, ++existingCount);
			} else {
				uniqueWordCountMap.put(word, 1);
			}			
		});
		
		return uniqueWordCountMap;
	}

}
