package com.app.geometry;

public class Assignment_04_Q1 {
	public static void main(String[] args)
	{
		
		Point2D p1 = new Point2D();		
		Point2D p2 = new Point2D();
		p1.acceptPoint();
		p2.acceptPoint();
		if(p1.isEqual(p2))
		{			
			p1.getDetails();
			p2.getDetails();
		}
		else
		{
			p1.getDetails();
			p2.getDetails();
			System.out.println("Distance between Points: "+p1.calculateDistance(p2));
		}			
	}
}
