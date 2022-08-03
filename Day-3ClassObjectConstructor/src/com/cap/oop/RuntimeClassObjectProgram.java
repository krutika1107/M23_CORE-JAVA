package com.cap.oop;

import java.util.Scanner;

class Vehicle
{
	//variable
	int a;
	//user-defined method
	void display()
	{
		System.out.println("Welcome to C2C M23 Batch");
	}
}

public class RuntimeClassObjectProgram {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		Vehicle obj = new Vehicle();
		System.out.println("Enter value of a= ");
		obj.a=s1.nextInt();
		Vehicle obj=new Vehicle();
		obj.display();
		System.out.println(obj.a);
		s1.close();

	}

}
