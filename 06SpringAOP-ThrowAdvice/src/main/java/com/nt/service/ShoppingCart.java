package com.nt.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;
@Service("shop")
public class ShoppingCart {
	public String shopping(String items[], double price[]) {
		if (items == null || price == null) {
			throw new IllegalArgumentException("items & price not supplied ");
		}//if
		double billAmt = 0;
		for (double p : price) {
			billAmt += p;
		}//for
		return Arrays.toString(items) + "   " + Arrays.toString(price) + "........." + billAmt;
	}//method
}//class