package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.nt.config.AppConfig;
import com.nt.service.ShoppingStore;

public class AfterAdviceTest {

	public static void main(String[] args) {
		// create IOC Container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		// invoke the method
		ShoppingStore stor = ctx.getBean("store", ShoppingStore.class);
		try {
			double billAmount = stor.shopping(new String[] { "shirt", "pant", "belt" },
					new double[] { 25000.0, 2000.50, 850.50 });
			System.out.println(billAmount);
		} // try
		catch (Exception e) {
			e.printStackTrace();
		} // catch
	}// main
}// class
