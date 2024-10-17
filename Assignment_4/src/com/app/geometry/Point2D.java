package com.app.geometry;


import java.lang.Math;
import java.util.Scanner;

public class Point2D 
{
	int x;
	int y;
	
	public Point2D() {
	}
	
	public Point2D(int x, int y) 
	{
		this.x = x;
		this.y = y;
	}
	
	public void acceptPoint()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x-Cordinate: ");
		x = sc.nextInt();
		System.out.println("Enter y-Cordinate: ");
		y = sc.nextInt();
	}
	
	public String getDetails()
	{
		String s = x+ ""+y;
		System.out.println("Cordinates: ("+x+"," +y+")");
		return s;
	}
	
	public boolean isEqual(Point2D p2)
	{
		if(this.x==p2.x && this.y==p2.y)
		{
			return true;
		}
		else
			return false;
	}
	
	public double calculateDistance(Point2D p2)
	{
		double d = Math.sqrt(Math.pow((this.x-p2.x),2)+Math.pow((this.y-p2.y),2));
		return d;
	}
}
