package com.cap.collection;

import java.util.ArrayDeque;


public class Example5 {

	public static void main(String[] args) {
		ArrayDeque a=new ArrayDeque();
		a.add(11);
		a.add("Krutika");
		a.addFirst(0.5);
		a.addLast('p');
		System.out.println(a);

	}

}