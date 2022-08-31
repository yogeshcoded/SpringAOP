package com.nt.advice;

import java.util.Arrays;
import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component("pmAspect")
@Aspect
public class PerformanceMonitoringAdvice {
	private long start,end;
	@Around("execution(double com.nt.service.BankService.*(..))")
	public Object performance(ProceedingJoinPoint pjp) throws Throwable {
		//pre logic 
		 start = System.currentTimeMillis();
		System.out.println("PerformanceMonitoringAdvice.performance() before entering"+new Date());
		//invoke b.method
		Object retVal = pjp.proceed();
		//post logic
	      end = System.currentTimeMillis();
		System.out.println("PerformanceMonitoringAdvice.performance() After Exiting"+new Date());
		System.out.println(pjp.getSignature() + " With args  " + Arrays.toString(pjp.getArgs()) + " has taken "+ (end - start)+ " ms to complete the execution");
				
		return retVal;

	}

}
