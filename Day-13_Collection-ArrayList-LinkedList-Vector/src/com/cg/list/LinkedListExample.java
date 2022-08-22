package com.cg.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		LinkedList obj=new LinkedList<>();
		obj.add(11);
		obj.add("Krutika");
		obj.add(11.07);
		obj.add(12.07);
		System.out.println(obj);
		System.out.println(obj.lastIndexOf(11));
		//checking size
		System.out.println(obj.size());
		//removing element
		System.out.println(obj.remove(0));
		

	}

}
