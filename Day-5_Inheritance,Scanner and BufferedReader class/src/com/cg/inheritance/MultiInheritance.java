package com.cg.inheritance;


class Bike
{
	protected int speed;
	void display()
	{
		System.out.println("I like to drive a Bike!");
	}

}
class KTM extends Bike
{
	protected String Color;
	void print()
	{
		System.out.println("speed is:"+speed);
	}
}
class pulser extends KTM
{
	void accept()
	{
		System.out.println("color is:"+Color);
	}
}
public class MultiInheritance {

	public static void main(String[] args) {
		pulser p=new pulser();
		p.Color="Black";
		p.speed=80;
		p.accept();p.display();
		p.print();
		

	}

}
