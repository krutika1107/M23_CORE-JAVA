package com.cap.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Example4 {

	public static void main(String[] args) {
		NavigableMap<Integer,String>s=new TreeMap<Integer,String>();
		s.put(11, "Krutika");
		s.put(12, null);
		//s.remove(12);
		System.out.println(s);
		System.out.println(s.lastEntry());


	}

}