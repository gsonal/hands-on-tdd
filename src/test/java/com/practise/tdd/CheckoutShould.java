package com.practise.tdd;

import static java.lang.String.valueOf;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.junit.Before;
import org.junit.Test;

public class CheckoutShould {

	Checkout checkout;
	List<Promotions> runningPromotions;
	
	@Before
	public void doSetup() {
		runningPromotions = getAvailablePromotions();
		checkout = new Checkout(runningPromotions);
	}
	
	@Test
	public void return_0_for_empty_cart() {
		assertEquals(new Integer(0), checkout.total(scanEachItem("")));
	}

	@Test
	public void return_50_for_cart_having_A() {
		assertEquals(new Integer(50), checkout.total(scanEachItem("A")));
	}
	
	@Test
	public void return_100_for_cart_having_AA() {
		assertEquals(new Integer(100), checkout.total(scanEachItem("AA")));
	}
	
	@Test
	public void return_130_for_cart_having_AAB() {
		assertEquals(new Integer(130), checkout.total(scanEachItem("AAB")));
	}
	
	@Test
	public void return_130_for_cart_having_AAA() {
		assertEquals(new Integer(130), checkout.total(scanEachItem("AAA")));
	}
	
	@Test
	public void return_260_for_cart_having_AAAAAB() {
		assertEquals(new Integer(260), checkout.total(scanEachItem("AAAAAB")));
	}
	
	@Test
	public void return_260_for_cart_having_AAAAAA() {
		assertEquals(new Integer(260), checkout.total(scanEachItem("AAAAAA")));
	}
	
	@Test
	public void return_305_for_cart_having_AAAAAA() {
		assertEquals(new Integer(305), checkout.total(scanEachItem("AAAAAABD")));
	}
	
	@Test
	public void return_190_for_cart_having_AAABBD() {
		assertEquals(new Integer(190), checkout.total(scanEachItem("AAABBD")));
	}
	
	private List<Promotions> getAvailablePromotions() {
		List<Promotions> availablePromotions = new ArrayList<>();
		Promotions newPromotion = new Promotions("A", 3, 130);
		availablePromotions.add(newPromotion);
		
		Promotions newPromotion2 = new Promotions("B", 2, 45);
		availablePromotions.add(newPromotion2);
		
		return availablePromotions;
	}

	private List<String> scanEachItem(String cartItems) {
		List<String> cart = new ArrayList<>();
		
		if(StringUtils.isNotEmpty(cartItems)) {
			for(Character item : cartItems.toCharArray()) {
				checkout.scan(valueOf(item), cart);
			}
		}
		
		return cart;
	}
}
