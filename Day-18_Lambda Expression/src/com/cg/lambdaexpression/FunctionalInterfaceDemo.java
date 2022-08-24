package com.cg.lambdaexpression;

interface D
{
	String display(String str);
}
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		D obj=(String str)->
		{
			return str;
		};
		System.out.println(obj.display("Welcome to Lambda Expression concept"));

	}

}
