package com.practise.tdd;

import static java.lang.String.valueOf;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		Map<String, Integer> productCountInCart = new HashMap<>();

		for(Character item : cart.toCharArray()) {
			String itemCode = valueOf(item);
			totalCost += productPriceDao.getPriceOf(itemCode);
			productCountInCart.put(itemCode, productCountInCart.getOrDefault(itemCode, 0)+1);
		}
		
		totalCost = adjustForPromotions(productCountInCart, totalCost);
		
		return totalCost;
	}

	private Integer adjustForPromotions(Map<String, Integer> productCountInCart, Integer totalCost) {
		for(Promotions promotion : ongoingPromotions) {
			String product = promotion.getProductSku();
			Integer countEligibleForDiscount = promotion.getQuantity();
			Integer discountedPrice = promotion.getDiscountedPrice();
			
			if(productEligibleForPromotion(productCountInCart, promotion)) {
				Integer priceForPurchasedQnty = countEligibleForDiscount * productPriceDao.getPriceOf(product);
				totalCost -= (priceForPurchasedQnty - discountedPrice);
			}
		}
		
		return totalCost;
	}

	private boolean productEligibleForPromotion(Map<String, Integer> productCountInCart, Promotions promotion) {
		String product = promotion.getProductSku();
		return (productCountInCart.containsKey(product) && promotion.getQuantity() == productCountInCart.get(product));
	}
	
}
