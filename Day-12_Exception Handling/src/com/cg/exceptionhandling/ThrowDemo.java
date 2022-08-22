package com.cg.exceptionhandling;

public class ThrowDemo {
	public static void display(int age, int weight)
	{
		if(age>18 && weight>45)
			System.out.println("Eligible to donate blood");
		else
		{
			throw new ArithmeticException("Exception Caught");
		}
	}
	public static void main(String args[])
	{
		try
		{
			display(23,54);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
	

	
}


