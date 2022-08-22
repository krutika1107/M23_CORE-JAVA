package com.cg.exceptionhandling;



public class NullPointerExceptionhandling {

	public static void main(String[] args) {
		
		String str=null;
		try
		{
			str.equals("Krutika");
		}
		catch(Exception e)
		{
			str=new String("Krutika");
			System.out.println(str.equals("Krutika"));
		}

	}

}
