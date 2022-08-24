package com.cg.lambdaexpression;
//functional interface=>contains exactly one absrtact method
interface A 
{
	void print();//abstract method
}
class B implements A
{
	public void print() {
		System.out.println("Functional Interface Implementation without/r"
				+" Lambda Expression");
	}
}

public class FunctionalInterfaceImpl {

	public static void main(String[] args) {
		B b=new B();
		b.print();
	}

}
