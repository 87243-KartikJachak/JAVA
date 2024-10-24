package com.app.fruits;

import java.util.Scanner;

public class FruitBasket 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int choice = 0;
		System.out.println("Enter the size of Basket: ");
		int basketsize = sc.nextInt();
		
		Fruit[] basket = new Fruit[5];
		int counter = 0;
		
		while(choice!=0)
		{
			
			System.out.println("---My Menu--");
			System.out.println("0. Exit");
			System.out.println("1. Add Apple");
			System.out.println("2. Add Orange");
			System.out.println("3. Add Mango");
			System.out.println("4. Display names of all the fruits in the basket");
			System.out.println("5. Display all Fruits");
			System.out.println("6. Display all stale fruit");
			System.out.println("7. Mark fruit as stale");
			System.out.println("8. Mark all sour fruits as stale");
			System.out.println("-----------------------------------");
			
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();

			switch(choice)
			{
				case 1:
					Fruit apple = new Apple();
					apple.isItFresh();
					if(apple.isFresh)
					{
						basket[counter] =apple;
						counter++;
					}
				break;

				case 2:
					Fruit orange = new Orange();
					orange.isItFresh();
					if(orange.isFresh)
					{						
						basket[counter] = orange;
						counter++;
					}
				break;
				
				case 3:
					Fruit mango = new Orange();
					mango.isItFresh();
					if(mango.isFresh)
					{						
						basket[counter] = mango;
						counter++;
					}
				break;

				case 4:
					for(Fruit fr: basket)
					System.out.println("Names of all the Fruit: "+fr.getName());
				break;

				case 5:
					for(int i=0; i<basket.length; i++)
					{
						System.out.println("The Fruits in the Basket: "+basket[i]);
					}
				break;

				case 6:
						for(Fruit e : basket)
							if(e.isFresh)
								System.out.println("Fresh Fruit:"+e.taste());
				break;

				case 7:
					System.out.println("Enter index: ");
					int index = sc.nextInt();
					if(index < counter)
					{
						basket[index].setFresh(false);
					}
				break;
				
				case 8:
					for(Fruit e : basket)
						if(e.taste() == "sour")
							e.isFresh = false;
				break;
			}
		}		
	}
}
