package com.cg.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings({ "rawtypes", "unused" })
		List obj=new ArrayList<>();
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
