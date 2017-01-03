package com.practise.tdd.util;

import java.util.Map;

import com.practise.tdd.Promotions;

public class PromotionAdjustor {

	public static boolean productEligibleForPromotion(Map<String, Integer> cart, Promotions promotion) {
		String product = promotion.getProductSku();
		return (cart.containsKey(product) 
				&& cart.get(product) >= promotion.geteligibleQuantity());
	}

	public static int getPriceDifference(Promotions promotion, Integer purchasedQuantity, Integer itemPrice) {
		Integer eligibleQuantity = promotion.geteligibleQuantity();
		Integer differenceAmount = getDifferentialAmount(promotion.getDiscountedPrice(), itemPrice, eligibleQuantity);

		return (purchasedQuantity / eligibleQuantity) * differenceAmount;
	}

	private static Integer getDifferentialAmount(Integer costAtDiscountedRate, Integer itemOriginalPrice, Integer eligibleQuantity) {
		Integer costAtMarketRate = eligibleQuantity * itemOriginalPrice;
		return (costAtMarketRate - costAtDiscountedRate);
	}

}
