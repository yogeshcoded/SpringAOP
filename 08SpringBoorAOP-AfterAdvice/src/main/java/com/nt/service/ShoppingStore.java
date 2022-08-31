package com.nt.service;

import org.springframework.stereotype.Service;

@Service("store")
public class ShoppingStore implements IShoppingStore {

	@Override
	public double shopping(String[] items, double[] price) {
		double billAmt = 0.0;
		for (double p : price) {
			billAmt = billAmt + p;
		} // for
		return billAmt;
	}// method
}// class
