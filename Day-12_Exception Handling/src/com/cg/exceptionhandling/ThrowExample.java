package com.cg.exceptionhandling;

public class ThrowExample {
	static void display()
	{
		try
		{
			System.out.println("Inside desplay method");
			return;
		}
		finally
		{
			System.out.println("Finally block  always executed");
		}
	}

	public static void main(String[] args) {
		try
		{
			System.out.println("Inside display method");
			throw new RuntimeException("demo");
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled e");
		}
	}

}
