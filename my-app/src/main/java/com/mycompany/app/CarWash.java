package com.mycompany.app;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class CarWash {
	
	@Pointcut("execution(* com.mycompany.app.Washer.wash(..))")
	public void washing() {}
	
	@Before("washing()")
	public void takeCash() {
		System.out.println("Taking cash");
	}
	
	public void pay() {
		System.out.println("Pay for washing");
	}
	
	public void takeCar() {
		System.out.println("your car is clean");
	}
	
	@AfterReturning("washing()")
	public void getChange() {
		System.out.println("Geting change");
	}
	

}
