package com.cg.streams;

import java.util.Arrays;
import java.util.List;

public class FilteringDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<Integer>obj=Arrays.asList(11,13,16,18);
		obj.stream().filter(i->i>15).forEach((i)->(System.out.print(i+" "));
	}

}
