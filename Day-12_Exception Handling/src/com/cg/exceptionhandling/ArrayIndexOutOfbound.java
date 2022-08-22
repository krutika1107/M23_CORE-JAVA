package com.cg.exceptionhandling;

public class ArrayIndexOutOfbound {

	    public static void main(String[] args){ 
	        System.out.println("First line");
	        System.out.println("Second line");
	        
	        try
	        {
	        int[] myIntArray = new int[]{1, 2, 3};
	        print(myIntArray);
	        
	        }
	        catch(Exception e)
	        {
	        	System.out.println(e);
	        }
	    }

		private static void print(int[] myIntArray) {
			// TODO Auto-generated method stub
			
		} 
}