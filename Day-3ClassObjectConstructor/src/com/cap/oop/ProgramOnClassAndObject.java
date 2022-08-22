package com.cap.oop;
//demo on Class and Object
class Car
{
	//variable
	int a;
	//user-defined method
	void display()
	{
		System.out.println("Welcome to C2C M23 Batch");
	}
}
public class ProgramOnClassAndObject {

	public static void main(String[] args) {
		// object creation
		Car obj=new Car();
		//accessing car class method
		obj.display();
		obj.a=11;
		//accessing car class variable
		System.out.println(obj.a);

	}

}
