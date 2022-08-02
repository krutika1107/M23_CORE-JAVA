package com.capgeminiIntro;

import java.util.Scanner;

public class CharProgram {

	public static void main(String[] args) {
		//compile-time
		//char x = 'a';
		Scanner s=new Scanner(System.in);
		char x=s.next().charAt();
		System.out.println("the character is :" +x);
		
	}

}
