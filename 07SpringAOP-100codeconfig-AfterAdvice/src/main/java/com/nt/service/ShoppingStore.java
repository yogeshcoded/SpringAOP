package com.nt.service;

import org.springframework.stereotype.Service;

@Service("store")
public class ShoppingStore {
public double shopping(String items[],double price[]) {
	double billAmt=0.0;
	for(double p:price) {
		billAmt=billAmt+p;
	}
	return billAmt;
}
}
