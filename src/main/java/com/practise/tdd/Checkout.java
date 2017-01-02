package com.practise.tdd;

import static com.practise.tdd.util.PromotionAdjustor.getPriceDifference;
import static com.practise.tdd.util.PromotionAdjustor.productEligibleForPromotion;
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
			if(productEligibleForPromotion(productCountInCart, promotion)) {
				Integer itemOriginalPrice = productPriceDao.getPriceOf(promotion.getProductSku());
				Integer purchasedQuantity = productCountInCart.get(promotion.getProductSku());
				totalCost -= getPriceDifference(promotion, purchasedQuantity, itemOriginalPrice);
			}
		}
		return totalCost;
	}

}
