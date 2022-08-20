package com.cap.collection;

import java.util.ArrayDeque;

public class Example1 {

	public static void main(String[] args) {
		ArrayDeque a=new ArrayDeque();
		a.add(11);
		a.add("Krutika");
		System.out.println(a);
		a.addFirst(12);
		a.addLast("Pawar");
		System.out.println(a);

	}

}