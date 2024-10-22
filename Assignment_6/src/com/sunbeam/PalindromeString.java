package com.sunbeam;

import java.util.Scanner;

public class PalindromeString 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String reverseString = "";
		boolean answer;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your string: ");
		String str = sc.next();

		for(int i=str.length()-1; i>=0; --i)
		{
			reverseString = reverseString + str.charAt(i);
		}
		
		if(reverseString.equals(str))
		{
			System.out.println("The Given String is Pallindrome!!");
		}
		else
		{
			System.out.println("Sorry the String is a normal String");
		}
	}

}
