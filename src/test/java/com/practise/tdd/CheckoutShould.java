package com.practise.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CheckoutShould {

	Checkout checkout;
	
	@Before
	public void doSetup() {
		checkout = new Checkout();
	}
	
	@Test
	public void return_0_for_empty_cart() {
		assertEquals(new Integer(0), checkout.total(""));
	}

	@Test
	public void return_50_for_cart_having_A() {
		assertEquals(new Integer(50), checkout.total("A"));
	}
	
}
