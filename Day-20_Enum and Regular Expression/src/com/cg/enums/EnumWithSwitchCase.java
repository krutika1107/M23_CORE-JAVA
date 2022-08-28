package com.cg.enums;

import java.io.InputStream;
import java.util.Scanner;

enum Movie
{
	KGF2,Bramhastra,Pushpa,Major,;
}

public class EnumWithSwitchCase 
{
	Movie movie;
	//constructor for the movie
	public EnumWithSwitchCase(Movie movie)
	{
		this.movie=movie;
	}
	//using display to song name
	public void display()
	{
		switch(movie)
		{
		case KGF2:
			System.out.println("Yash and Shrinidhi Shety");
			break;
		case Bramhastra:
			System.out.println("Ranbir and Alia");
			break;
		case Pushpa:
			System.out.println("Allu Arjun and Alia");
			break;
		case Major:
			System.out.println("Adivi and Saiee");
			break;
		default :
			System.out.println("Invalid movie name");
		
		}
	}
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter movie which you want to be display");
		String str=s.nextLine();
		EnumWithSwitchCase  obj=new EnumWithSwitchCase(Movie.valueOf(str));
		obj.display();

	}
	@SuppressWarnings("unused")
	private static Object Scanner(InputStream in) {
		// TODO Auto-generated method stub
		return null;
	}

}
