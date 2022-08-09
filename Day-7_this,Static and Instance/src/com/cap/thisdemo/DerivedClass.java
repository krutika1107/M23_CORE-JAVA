package com.cap.thisdemo;

public class DerivedClass extends Base1
{
	DerivedClass()
	{
		System.out.println("Default constuctor for Derived");
	}
	DerivedClass(int i)
	{
		this();
		System.out.println("Parameterized constuctor for Derived");
	}

}
