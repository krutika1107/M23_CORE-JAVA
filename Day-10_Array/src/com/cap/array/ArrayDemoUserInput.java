package com.cap.array;

import java.util.Scanner;

public class ArrayDemoUserInput {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		int size =s.nextInt();
		//array declaration
		int arr[]=new int[size];
		System.out.println("Enter the values: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the "+i+" index");
			arr[i]=s.nextInt();
		}
		//To print elements in the array
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
