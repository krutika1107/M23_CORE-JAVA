package com.cg.inheritance;

class A
{
	protected int rollno;
	void print()
	{
		System.out.println("Hey! Welcome to C2TC batch");
	}
}
class B extends A

{
	void accept()
	{
		System.out.println("rollno is: "+rollno);
	}


}

public class SingleInheritance {

	public static void main(String[] args) {
		B b=new B();
		b.accept();
		b.print();

	}

}
