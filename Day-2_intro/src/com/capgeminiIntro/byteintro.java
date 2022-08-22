package com.capgeminiIntro;

import java.util.Scanner;

//program for byte data-type
public class byteintro {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number you want:");
		  Byte num=input.nextByte();
		  	System.out.println("output value: "+(num *(num+2))/2);
		  	input.close();
		  

	}

}
