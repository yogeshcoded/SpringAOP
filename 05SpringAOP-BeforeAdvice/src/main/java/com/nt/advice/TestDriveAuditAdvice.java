package com.nt.advice;

import java.util.Scanner;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component("testDrive")
@Aspect
public class TestDriveAuditAdvice {

	@Before(value="execution(java.lang.String com.nt.service.CarShowRoom.purchase(..))")
	public void testDrive(JoinPoint jp) throws Throwable {
		System.out.println("TestDriveAuditAdvice.testDrive()");
		Object args[] = jp.getArgs();
		System.out.println(args[1] + " model car test driving happens.to Customer " + args[0]);
		Scanner scn = new Scanner(System.in);
		System.out.println("DId you like this car?");
		boolean isLiked = scn.nextBoolean();
		if (!isLiked) {
			throw new IllegalArgumentException(args[1] + "is not liked");
		}//if

	}
}
