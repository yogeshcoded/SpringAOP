package com.nt.advice;

import java.io.FileWriter;
import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.nt.exception.InvalidInputException;
@Component
@Aspect
public class CommonExceptionAndLogger {
	@AfterThrowing(value = "execution(java.lang.String com.nt.service.ShoppingCart.shopping(..))",throwing = "e")
public void exceptionLogger_Grapher(JoinPoint jp,Exception e)throws Throwable {
	//Excecution Logging
	String execptionMsg="exception is raised"+jp.getSignature()+" with args"+Arrays.toString(jp.getArgs());
	FileWriter writer=new FileWriter("e:\\exepLogg.text",true);
	writer.write(execptionMsg);
	writer.flush();
	writer.close();
	//Exception Graphing
	throw new InvalidInputException(e.getMessage());
}
}
