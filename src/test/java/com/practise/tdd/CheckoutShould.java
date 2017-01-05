package com.practise.tdd;

import static java.lang.String.valueOf;
import static org.junit.Assert.assertEquals;
import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class CheckoutShould {

	Checkout checkout;
	List<Promotions> runningPromotions;
	String itemsInCart;
	Integer paymentDue;
	
	public CheckoutShould(String itemsInCart, Integer paymentDue) {
		this.itemsInCart = itemsInCart;
		this.paymentDue = paymentDue;
	}
	
	@Before
	public void doSetup() {
		runningPromotions = getAvailablePromotions();
		checkout = new Checkout(runningPromotions);
	}
	
	@Parameters(name = "print_{1}_for_{0}_number() = {1}")
	public static Collection<Object[]> data() {
		return asList(new Object[][] {
			{"", 0},
			{"A", 50},
			{"AA", 100},
			{"AAB", 130},
			{"AAA", 130},
			{"AAAAAB", 260},
			{"AAAAAA", 260},
			{"AAAAAABD", 305},
			{"AAABBD", 190}
		});
	}
	
	@Test
	public void return_total_cost_of_purchased_items() {
		assertEquals(paymentDue, checkout.total(scanEachItem(itemsInCart)));
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
