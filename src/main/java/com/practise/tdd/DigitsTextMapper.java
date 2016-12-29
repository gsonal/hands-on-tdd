package com.practise.tdd;

import java.util.Map;

public abstract class DigitsTextMapper {

	protected Map<Integer, String> digitToWordsMap;
	
	protected abstract DigitsTextMapper initialize();
	
	DigitsTextMapper() {
		initialize();
	}
	
	public String getValue(Integer key) {
		return digitToWordsMap.get(key);
	}
}
