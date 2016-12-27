package com.practise.tdd;

import static org.junit.Assert.assertEquals;
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
		assertEquals("TDD 1", wordCount.getUnqiueWordsWithCountFromString("TDD"));
	}
	
	@Test
	public void return_unique_words_with_count_in_two_word_string() {
		assertEquals("TDD 1, CleanCode 1", wordCount.getUnqiueWordsWithCountFromString("TDD CleanCode"));
	}
}
