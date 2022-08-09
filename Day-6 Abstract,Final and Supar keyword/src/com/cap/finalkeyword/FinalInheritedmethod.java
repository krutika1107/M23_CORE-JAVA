package com.cap.finalkeyword;
class Car
{
	String name;
	final void print(String name)
	{
		System.out.println("My name is :"+name);
	}
}
class Audi extends Car
{
	
}
public class FinalInheritedmethod {

	public static void main(String[] args) {
		Audi a=new Audi();
		a.print("Audi");

	}

}
