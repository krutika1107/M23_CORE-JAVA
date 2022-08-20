package com.cap.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Example2 {

	public static void main(String[] args) {
		LinkedHashSet s=new LinkedHashSet();
		s.add(11);
		s.add(null);
		s.add(11);
		System.out.println(s);


	}

}