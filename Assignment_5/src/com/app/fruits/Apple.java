package com.app.fruits;

public class Apple extends Fruit 
{
	public Apple() 
	{
		
	}

	public Apple(String name, String color, double weight , boolean isFresh) 
	{
		super(name, weight,color,isFresh);
	}
	
	@Override
	public String taste() {
		return "Sweet and Sour";
	}
}
