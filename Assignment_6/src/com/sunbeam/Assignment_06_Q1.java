package com.sunbeam;

import java.util.Scanner;

public class Assignment_06_Q1 
{	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your string: ");
		String str = sc.next();
			
		try
		{
			if(str.length() > 80)
			{
				throw new ExceptionLineTooLong("Woah!, Slow Down Shakesphere!!");
			}
			else
			{
				System.out.println("The Given String is a Valid String!!");
				System.out.println("It has "+str.length()+" characters in it");
			}
		} catch(ExceptionLineTooLong e)
		{
			e.printStackTrace();
		}
				
				
	}

}
