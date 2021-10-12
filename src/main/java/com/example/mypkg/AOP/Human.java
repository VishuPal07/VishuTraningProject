package com.example.mypkg.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import com.example.mypkg.services.EmailSenderService;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Human {

	
	@Autowired
	private EmailSenderService service;
//	@After("mypoint()")
//	public void sleep()
//	{
//		System.out.println("sleep");
//	}
//	
//	@Before("mypoint()")
//	public void wake()
//	{
//		System.out.println("sleep");
//	}
//	
//	@Pointcut("execution(* study*())")
//	public void mypoint() {
//		
//	}
	
//	@AfterReturning(pointcut = "execution(* study(..))")
	public void triggerMail() {
		try {
			service.simpleMailSender("vishupal251201@gmail.com",
					"this is body",
					"this is subject");
			System.out.println("hi");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	@AfterReturning(pointcut = "execution(* study*(..))",returning = "val")
//	public void wake(int val)
//	{
//		System.out.println("sleep"+ val);
//	}
//	
//	@AfterThrowing(pointcut = "execution(* doexc())", throwing = "val")
//	public void wak(RuntimeException val)
//	{
//		System.out.println("sleep"+ val);
//	}
	@Around("execution(* study(..))")
	public void go(ProceedingJoinPoint jp) {
		System.out.println("hi");
		try {
			jp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("hi");
	}
}
