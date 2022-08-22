package com.cap.thisdemo;

public class Base1 {

	Base1()
	{
		this(65);
		System.out.println("Default value is: ");
	}

	Base1(int i)
	
	{
		System.out.println("Parameterized value is: "+i);
	}
}
