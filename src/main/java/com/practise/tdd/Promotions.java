package com.practise.tdd;

public class Promotions {
	
	private String productSku;
	private Integer eligibleQuantity;
	private Integer discountedPrice;
	
	public Promotions(String productSku, Integer quantity,	Integer discountedPrice) {
		this.productSku = productSku;
		this.eligibleQuantity = quantity;
		this.discountedPrice = discountedPrice;
	}

	public String getProductSku() {
		return productSku;
	}

	public Integer geteligibleQuantity() {
		return eligibleQuantity;
	}

	public Integer getDiscountedPrice() {
		return discountedPrice;
	}

}
