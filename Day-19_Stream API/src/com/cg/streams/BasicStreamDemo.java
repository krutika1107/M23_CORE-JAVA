package com.cg.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicStreamDemo {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Stream<String>obj=Stream.of("Krutika","Anu","Viju");
		obj.forEach((i)->System.out.println(i+ " "));
		
		//stream can be acquired from array or collection
		List<String>obj1=Arrays.asList(new String[] {"11","13","16"});
		obj=obj1.stream();
		obj.forEach(System.out::println);
	}

}
