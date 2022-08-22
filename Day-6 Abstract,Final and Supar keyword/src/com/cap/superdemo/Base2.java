package com.cap.superdemo;

public class Base2  extends Base1
{
	Base2()
	{
		super();//call to parent class default constructor
		System.out.println("Default Constructor for Base2");
	}
	Base2(int i)
	{
		super();//call to parent class constructor
		System.out.println("Parameterized Constroctor for Base2: "+1);
	}
}
