package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.CarShowRoom;

public class BeforeAdviceTest {

	public static void main(String[] args) {
		// create IOC Container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfg/applicationContext.xml");
		//crate objecat
		CarShowRoom car=ctx.getBean("showroom",CarShowRoom.class);
		//invoke b.methods
		String msg=car.purchase("Raja", "Baleno", 1200000.0);
		System.out.println(msg);
	}// main
}// class
