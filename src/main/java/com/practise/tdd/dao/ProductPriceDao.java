package com.practise.tdd.dao;

import java.util.HashMap;
import java.util.Map;

public class ProductPriceDao {

	private Map<String, Integer> productPrice;
	
	public ProductPriceDao() {
		productPrice = new HashMap<>();
		productPrice.put("A", 50);
		productPrice.put("B", 30);
		productPrice.put("C", 20);
		productPrice.put("D", 15);
	}
	
	public Integer getPriceOf(String productSku) {
		return productPrice.get(productSku);
	}

}
