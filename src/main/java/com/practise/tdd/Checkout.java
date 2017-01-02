package com.practise.tdd;

import com.practise.tdd.dao.ProductPriceDao;

public class Checkout {
	ProductPriceDao productPriceDao;
	
	public Checkout() {
		this.productPriceDao = new ProductPriceDao();
	}
	
	public Integer total(String cart) {
		Integer totalCost = 0;

		for(Character item : cart.toCharArray()) {
			totalCost += productPriceDao.getPriceOf(String.valueOf(item));
		}
		
		return totalCost;
	}
	
}
