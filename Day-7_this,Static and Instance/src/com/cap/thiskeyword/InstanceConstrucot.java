package com.cap.thiskeyword;
class A 
{
	public int num;
	A(){
		System.out.println("Welcome to M23 Batch");
	}
	A(int num)
	{
		this.num=num;
	}
}
public class InstanceConstrucot {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		A a=new A();
		A b=new A(5);
		System.out.println(b.num);
	}

}
