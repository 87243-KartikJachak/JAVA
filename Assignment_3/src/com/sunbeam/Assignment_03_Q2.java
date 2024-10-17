package com.sunbeam;

import java.util.Scanner;

public class Assignment_03_Q2 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		int choice = 0;
		
		while(choice != 4)
		{
			System.out.println("------Menu-------");
			System.out.println("1. Add Employee");
			System.out.println("2. Display Employee");
			System.out.println("3. Add Salary Hike");
			System.out.println("4. Exit");
			System.out.println("-----------------");

			System.out.println("Enter your choice: ");
			choice = sc.nextInt();

			switch(choice)
			{
				case 1:
						e1.acceptEmployee();
						System.out.println("Record Inserted!!");
						e2.acceptEmployee();
						System.out.println("Record Inserted!!");
						e3.acceptEmployee();
						System.out.println("Record Inserted!!");
				break;
				case 2:
						e1.displayEmployee();
						e1.salaryHike();
						e2.displayEmployee();
						e2.salaryHike();
						e3.displayEmployee();
						e2.salaryHike();
				break;
				case 3:
						e1.salaryHike();
						e2.salaryHike();
						e3.salaryHike();
				break;
				case 4:
						System.exit(0);
				break;

			}
		}
	}
}
