package com.cg.exceptionhandling;

public class MultiCatchBlock {

	public static void main(String[] args) {
		try
		{
		int a=args.length;
		System.out.println("a= "+a);
		@SuppressWarnings("unused")
		int b=54/a;
		int arr[]= {15};
		arr[3]=65;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}

	}

}
