package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BankService;

public class AroundAdviceTest {
	public static void main(String[] args) {
		// create IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfg/applicationContext.xml");
		// get proxy class objec
		BankService proxy = ctx.getBean("bankService", BankService.class);
		System.out.println(proxy.getClass()+"           "+proxy.getClass().getSuperclass());
		// invoke the b.method
		System.out.println("SI Amount :  " +proxy.calSimpleIntrestAmount(100000.0, 2.5, 12.0));
		
		System.out.println("==============================");
		
		System.out.println("CI Amount :  " +proxy.calCompoundIntrestAmount(100000.0, 3.0, 12.0));
		
		
	}
}
