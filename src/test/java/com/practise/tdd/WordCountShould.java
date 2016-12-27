package com.practise.tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class WordCountShould {

	WordCount wordCount;
	
	@Before
	public void setup() {
		wordCount = new WordCount();
	}
	
	@Test
	public void return_unique_words_in_single_word_string() {
		Map<String, Integer> outputWordCount = wordCount.getUnqiueWordsWithCountFromString("TDD");
		assertNotNull(outputWordCount);
		assertEquals(1, outputWordCount.size());
		assertEquals(new Integer(1), outputWordCount.get("TDD"));
	}
	
	@Test
	public void return_unique_words_with_count_in_two_word_string() {
		Map<String, Integer> outputWordCount = wordCount.getUnqiueWordsWithCountFromString("TDD CleanCode");
		assertNotNull(outputWordCount);
		assertEquals(2, outputWordCount.size());
		assertEquals(new Integer(1), outputWordCount.get("TDD"));
		assertEquals(new Integer(1), outputWordCount.get("CleanCode"));
	}
	
	@Test
	public void return_unique_words_with_count_in_repeated_string() {
		Map<String, Integer> outputWordCount = wordCount.getUnqiueWordsWithCountFromString("TDD CleanCode TDD Practice");
		assertNotNull(outputWordCount);
		assertEquals(3, outputWordCount.size());
		assertEquals(new Integer(2), outputWordCount.get("TDD"));
		assertEquals(new Integer(1), outputWordCount.get("CleanCode"));
		assertEquals(new Integer(1), outputWordCount.get("Practice"));
	}
}
