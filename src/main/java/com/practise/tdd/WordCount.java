package com.practise.tdd;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class WordCount {

	public String getUnqiueWordsWithCountFromString(String input) {
		String output = "";
		
		List<String> allWords = Arrays.asList(input.split(" "));
		
		Map<String, Integer> wordCountMap = countUniqueWords(allWords);
		for(Entry<String, Integer> entry : wordCountMap.entrySet()) {
			output += entry.getKey() + " " + entry.getValue() + ", ";
		}
		
		return output.substring(0, output.length()-2);
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
