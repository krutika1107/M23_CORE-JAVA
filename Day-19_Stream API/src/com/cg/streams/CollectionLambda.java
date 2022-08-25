package com.cg.streams;

import java.util.HashSet;
import java.util.Set;

public class CollectionLambda {

	public static void main(String[] args) {
		Set<Integer> obj=new HashSet<>();
		obj.add(11);
		obj.add(13);
		obj.add(16);
		
		System.out.println(obj);
		obj.forEach(System.out::println);
		
	}

}
