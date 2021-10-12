package com.example.mypkg.AOP;

import org.springframework.stereotype.Component;

@Component
public class Student {

	public void study()
	{
		System.out.println("hello");
	}
	
	public int studyA(int i)
	{
		System.out.println("hello");
		return i;
	}
	
	public void doexc()
	{
//		throw new RuntimeException("this is exception");
	}
}
