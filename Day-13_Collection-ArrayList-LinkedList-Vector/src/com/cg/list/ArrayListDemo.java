package com.cg.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//ArrayList<Integer>obj=new ArrayList<Integer>();
		LinkedList<Integer>obj= new LinkedList<Integer>();
		obj.add(12);
		obj.add(45);
		System.out.println(obj);
		System.out.println(obj.contains(5));
		System.out.println(obj.get(1));
		obj.set(0, 13);
		System.out.println(obj);
		Object copy;
		copy=obj.clone();
		System.out.println(copy);
		//add
		obj.addFirst((9));
		obj.addLast(7);
		System.out.println(obj);



	}

}
