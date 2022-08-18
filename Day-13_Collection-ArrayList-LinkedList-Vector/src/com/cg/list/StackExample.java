package com.cg.list;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack obj=new Stack();
		obj.add(0, 'K');
		obj.add(0, 'p');
		obj.add(0, 11.7f);
		System.out.print(obj);
		obj.push(34);
		System.out.print(obj);
		obj.pop();
		System.out.print(obj);

	}

}
