package com.practise.tdd;

import java.util.List;

import com.practise.tdd.dao.ProductPriceDao;

public class Checkout {
	ProductPriceDao productPriceDao;
	List<Promotions> ongoingPromotions;
	
	public Checkout(List<Promotions> runningPromotions) {
		this.productPriceDao = new ProductPriceDao();
		this.ongoingPromotions = runningPromotions;
	}
	
	public Integer total(String cart) {
		Integer totalCost = 0;

		for(Character item : cart.toCharArray()) {
			totalCost += productPriceDao.getPriceOf(String.valueOf(item));
		}
		
		return totalCost;
	}

	
	
}
