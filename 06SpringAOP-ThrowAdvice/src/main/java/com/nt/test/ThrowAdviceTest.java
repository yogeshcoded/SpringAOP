package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.ShoppingCart;


public class ThrowAdviceTest {

	public static void main(String[] args) {
		// create IOC Container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfg/applicationContext.xml");
		//create target class object 
		ShoppingCart shop=ctx.getBean("shop",ShoppingCart.class);
		//invoke b.method
		try {
		String msg=shop.shopping(new String[] {"shirt","paint","shows"},
				                                        new double[] {1500,8504,5000});
		System.out.println(msg);
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}//catch
		try {
			String msg=shop.shopping(new String[] {"shirt","paint","shows"}, null);
					                                    
			System.out.println(msg);
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}//catch
	}// main
}// class
