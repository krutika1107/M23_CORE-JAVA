package com.cap.thiskeyword;

class Main
{
	int x,y;
	//default constructor
	Main()
	{
		x=10;
		y=20;
	}
	Main get()
	{
		return this;
	}
	public void display()
	{
		System.out.println("Multiplication of x and y is: "+(x*y));
	}
}
public class CurrentClassInstance {

	public static void main(String[] args) {
		Main m=new Main();
		m.get().display();
	}

}
