package com.cg.lambdaexpression;
interface E
{
	int add(int a, int b);
}
public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		/*E obj=(int a, int b)->
		{
			return a+b;
		};
		System.out.println(obj.add(12,15));*/
		E obj=(int a, int b)->(a+b);
		System.out.println("addition of a and b is: "+obj.add(12, 15));
	}

}
