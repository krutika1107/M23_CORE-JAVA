package com.cg.lambdaexpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorLambda {

	public static void main(String[] args) {
		Comparator<String>obj=(s1,s2)->Integer.compare(
				s1.length(),s2.length());
		String str[]= {"Kp","Viju","Saurya","Anu"};
		Collections.sort(Arrays.asList(str),obj);
		for(String i:str)
		{
			System.out.println(i+" ");
		}
	}

}
