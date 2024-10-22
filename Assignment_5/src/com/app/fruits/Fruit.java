package com.app.fruits;

import java.util.Scanner;

public abstract class Fruit
{
	String color;
	double weight;
	String name;
	boolean isFresh;
	
	public Fruit() {
	}

	public Fruit(String color, double weight, String name, boolean isFresh) 
	{
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public void accept(Scanner sc)
	{
		
		System.out.println("----------------------------");
		System.out.println("Enter Name of the Fruit: ");
		name = sc.next();
		System.out.println("Enter colour: ");
		color = sc.next();
		System.out.println("Enter weight: ");
		weight = sc.nextDouble();
	}
	
	public void isItFresh()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Hey, are the "+getName()+" fresh");
		System.out.println("Yes");
		System.out.println("No");
		String fresh = sc.next();
		if(fresh == "Yes")
		{
			isFresh = true;
		}
		else
		{
			isFresh = false;
		}
	}
	
	public void display()
	{
		System.out.println("-----------------------------");
		System.out.println("Fruit name: "+getName());
		System.out.println("Fruit colour: "+getColor());
		System.out.println("Weight: "+getWeight());
		System.out.println("Is it Fresh: "+isFresh());
		System.out.println("Taste: "+taste());
		System.out.println("------------------------------");
	}
	public abstract String taste();
}
