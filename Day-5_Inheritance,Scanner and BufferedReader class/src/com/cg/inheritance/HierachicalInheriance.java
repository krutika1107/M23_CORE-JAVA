package com.cg.inheritance;

class AndroidVersion
{
	void display()
	{
		System.out.println("Android-verison");
	}
}
class Kitkat extends AndroidVersion
{
	void print()
	{
		System.out.println("Kitkat");
	}
}
class Pie extends AndroidVersion
{
	void print1()
	{
		System.out.println("Pie");
	}
	
}
public class HierachicalInheriance {

	public static void main(String[] args) {
		Kitkat k=new Kitkat();
		Pie p=new Pie();
		k.display();
		k.print();
		p.print1();
		
		
	}

}
