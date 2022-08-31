package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.ShoppingStore;

public class AfterAdviceTest {

	public static void main(String[] args) {
		// create IOC Container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfg/applicationContext.xml");
		// invoke the method
		ShoppingStore stor = ctx.getBean("store", ShoppingStore.class);
		try {
			double billAmount=stor.shopping(new String[] { "shirt", "pant", "belt" }, new double[] { 25000.0, 2000.50, 850.50 });
			System.out.println(billAmount);
		} // try
		catch (Exception e) {
			e.printStackTrace();
		} // catch
	}// main
}// class
