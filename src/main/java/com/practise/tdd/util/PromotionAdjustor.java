package com.practise.tdd.util;

import java.util.Map;

import com.practise.tdd.Promotions;

public class PromotionAdjustor {

	public static boolean productEligibleForPromotion(Map<String, Integer> cart, Promotions promotion) {
		String product = promotion.getProductSku();
		return (cart.containsKey(product) 
				&& cart.get(product) == promotion.geteligibleQuantity());
	}

	public static int getPriceDifference(Promotions promotion, Integer itemPrice) {
		return getPriceForPurchasedQuantity(promotion, itemPrice) - promotion.getDiscountedPrice();
	}
	
	private static Integer getPriceForPurchasedQuantity(Promotions promotion, Integer itemPrice) {
		return promotion.geteligibleQuantity() * itemPrice;
	}
	
}
