package com.cg.exceptionhandling;

import java.util.Scanner;

public class AirthmeticException {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int res;
		
		
		try
		{
			int a=11;
			System.out.println("Enter the value of b: ");
			int b=s.nextInt();
			res=a/b;
			System.out.println(res);
			
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled" +e);
		}
	
		s.close();
		
		

	}

}
