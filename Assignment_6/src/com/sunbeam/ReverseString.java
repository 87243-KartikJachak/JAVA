package com.sunbeam;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch;
		String reverse = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your string: ");
		String str = sc.next();
		
		for(int i=0; i<str.length(); i++)
		{
			ch = str.charAt(i);
			reverse = ch + reverse;
		}
		
		System.out.println("Reversed String: "+reverse);

	}

}
