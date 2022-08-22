package com.cap.thiskeyword;
class z
{
	public int x;
	z()
	{
		this(23);
		System.out.println("Default Constructor");
		
	}
	z(int x)
	{
		System.out.println("value is: "+x);
	}
}
public class InvokeConstuctor {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		z obj=new z();
	}

}
