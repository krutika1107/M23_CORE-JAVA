package com.cap.instance;
//instanceof Operator
public class InstanceOfDemo {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		InstanceOfDemo obj=new InstanceOfDemo();
		InstanceOfDemo obj1=new InstanceOfDemo();

		System.out.println(obj1 instanceof InstanceOfDemo);

	}

}