package com.nt.service;

import org.springframework.stereotype.Service;

@Service("bankService")
public class BankService {
	public double calSimpleIntrestAmount(double pamt, double rate, double time) {
		return pamt * rate * time / 100;
	}

	public double calCompoundIntrestAmount(double pamt, double rate, double time) {
		return (pamt * Math.pow(1 + rate / 100, time))-pamt;
	}
}
