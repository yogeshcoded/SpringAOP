package com.nt.service;

import org.springframework.stereotype.Service;

@Service("showroom")
public class CarShowRoom {
	public String purchase(String custName, String carModel, double price) {
		System.out.println("CarShowRoom.carSeller()");
		if (carModel.equalsIgnoreCase("baleno")) {
			return "Car " + carModel + " is sold out at price " + price + " to Customer " + custName;
		}
		return "car " + carModel + " is not available for sell";
	}
}
