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
//		productPrice.entrySet().stream().filter( item -> "A".equals(item.getKey())).collect(Collectors.toList()) );
		
		return productPrice.get(productSku);
	}

	public Map<String, Integer> getProductPrice() {
		return productPrice;
	}
}
