package com.practise.tdd;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

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
		assertEquals(new Integer(0), checkout.total(""));
	}

	@Test
	public void return_50_for_cart_having_A() {
		assertEquals(new Integer(50), checkout.total("A"));
	}
	
	@Test
	public void return_100_for_cart_having_AA() {
		assertEquals(new Integer(100), checkout.total("AA"));
	}
	
	@Test
	public void return_130_for_cart_having_AAB() {
		assertEquals(new Integer(130), checkout.total("AAB"));
	}
	
	@Test
	public void return_130_for_cart_having_AAA() {
		assertEquals(new Integer(130), checkout.total("AAA"));
	}
	
	@Test
	public void return_260_for_cart_having_AAAAAB() {
		assertEquals(new Integer(260), checkout.total("AAAAAB"));
	}
	
	private List<Promotions> getAvailablePromotions() {
		List<Promotions> availablePromotions = new ArrayList<>();
		Promotions newPromotion = new Promotions("A", 3, 130);
		availablePromotions.add(newPromotion);
		
		return availablePromotions;
	}

}
