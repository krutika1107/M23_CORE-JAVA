package com.cap.polymorphism;

class Renault
{
	String color;
	int speed;
	Renault()
	{
		System.out.println("Renault-RXE");
	}
	Renault(String clr,int s)
	{
		color=clr;
		speed=s;
		System.out.println("color is "+clr+" ."+"speed is "+s+"km/hr");
	}
}


public class ConstructOverloading {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Renault r=new Renault();
		@SuppressWarnings("unused")
		Renault r1=new Renault("Yellow",50);

	}

}