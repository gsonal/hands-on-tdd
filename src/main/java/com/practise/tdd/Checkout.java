package com.practise.tdd;

import org.apache.commons.lang3.StringUtils;

public class Checkout {

	public Integer total(String cart) {
		if(StringUtils.equals(cart, "A")) {
			return new Integer(50);
		}
		return 0;
	}
	
}
