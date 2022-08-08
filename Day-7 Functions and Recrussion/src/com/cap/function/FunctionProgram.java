package com.cap.function;

import java.util.Scanner;

public class FunctionProgram {
    
	static int fact=1;
	static int factorial (int n)
	{
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(factorial(n));
		s.close();

	}

}