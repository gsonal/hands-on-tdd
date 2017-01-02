package com.practise.tdd;

public class Promotions {
	
	private String productSku;
	private Integer quantity;
	private Integer discountedPrice;
	
	public Promotions(String productSku, Integer quantity,	Integer discountedPrice) {
		this.productSku = productSku;
		this.quantity = quantity;
		this.discountedPrice = discountedPrice;
	}

	public String getProductSku() {
		return productSku;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public Integer getDiscountedPrice() {
		return discountedPrice;
	}

}
