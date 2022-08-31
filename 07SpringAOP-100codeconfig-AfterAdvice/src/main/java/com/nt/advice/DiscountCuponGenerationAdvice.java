package com.nt.advice;

import java.io.FileWriter;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component("pAfter")
@Aspect
public class DiscountCuponGenerationAdvice {
	@AfterReturning(returning = "bamt", 
			                       value = "execution( double com.nt.service.ShoppingStore.shopping(..))")
	public void cupen(JoinPoint jp, double bamt) throws Throwable {
		String cupenMsg = null;
		if (bamt <= 5000) {
			cupenMsg = "Avail 5% Discount in the next purchase";
		} else if (bamt <= 10000) {
			cupenMsg = "Avail 10% Discount in the next purchase";
		} else if (bamt<= 20000) {
			cupenMsg = "Avail 15% Discount in the next purchase";
		} else {
			cupenMsg = "Avail 20% Discount in the next purchase";
		}
		// write msg for cupen
		FileWriter writer = new FileWriter("e:\\\\cupon.txt");
		writer.write(cupenMsg);
		writer.flush();
		writer.close();
		System.out.println("Code is generated");
	}
}
