package com.sunbeam;

import java.util.Scanner;

public class Employee {
	
	String firstname;
	String lastname;
	double salary;
	
	public Employee() 	{
	}
	
	public Employee(String firstname, String lastname, double salary) 
	{
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
	}
	
	public String getFirstname() 
	{
		return firstname;
	}
	
	public void setFirstname(String firstname) 
	{
		this.firstname = firstname;
	}
	
	public String getLastname() 
	{
		return lastname;
	}
	
	public void setLastname(String lastname) 
	{
		this.lastname = lastname;
	}
	
	public double getSalary() 
	{
		return salary;
	}
	
	public void setSalary(double salary) 
	{
		if(salary < 0.0)
		{
			System.out.println("Salary cannot be negative!!");
		}
		else
		{			
			this.salary = salary;
		}
	}

	public void acceptEmployee()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Name: ");
		firstname = sc.next();
		System.out.println("Enter Last Name: ");
		lastname = sc.next();
		System.out.println("Enter Salary: ");
		salary = sc.nextDouble();
	}
	
	public void salaryHike()
	{
//		Scanner sc = new Scanner(System.in);
//
//		double percentage;
		double annualSalary = (getSalary() * 12);
		double absoluteSalary = (annualSalary * 10)/100;
		
		double newSalary = (annualSalary + absoluteSalary);
		
//		System.out.println("Annual Salary: "+annualSalary);
		System.out.println("Current Salary: "+annualSalary);
		System.out.println("New Salary: "+newSalary);
	}
	
	public void displayEmployee() 
	{
		System.out.println("----------------------------");
		System.out.println("Employee Name: "+getFirstname()+" "+getLastname());
		double annualSalary = (getSalary() * 12);
		System.out.println("Employee Salary: "+annualSalary);
		System.out.println("----------------------------");
	}
}