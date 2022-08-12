package com.cap.array;

public class CharArrayDemo {

	public static void main(String[] args) {
		char arr[] = {'a','1','2','?',' ','B','C','3','b'};
		
		for (int i=0;i<arr.length;i++)
		{
			if(Character.isDigit(i));
			{
				System.out.println(arr[i]+" is a digit");
			}
			if(Character.isLetter(i));
			{
				System.out.println(arr[i]+" is a letter");
			}
			if(Character.isUpperCase(i));
			{
				System.out.println(arr[i]+" is a uppercase");
			}
			if(Character.isLowerCase(i));
			{
				System.out.println(arr[i]+" is a lowercase");
			}
		}

	}
	
}


