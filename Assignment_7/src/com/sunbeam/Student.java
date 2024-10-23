package com.sunbeam;

import java.util.Scanner;

public class Student implements Comparable<Student>{
	
	private int roll; 
	private String name; 
	private String city; 
	private double marks;
	
	public Student() {
	}

	public Student(int roll, String name, String city, double marks) 
	{
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public void accept(Scanner sc)
	{
		System.out.println("Enter Student roll number: ");
		roll = sc.nextInt();
		System.out.println("Enter Student Name: ");
		name = sc.next();
		System.out.println("Enter Student City: ");
		city = sc.next();
		System.out.println("Enter Student Marks: ");		
		marks = sc.nextDouble();
	}
	
	public void display(Student[] std)
	{
		System.out.println("-----------------------------------");
		for(Student stud : std)
			System.out.println(stud);
		System.out.println("-----------------------------------");		
	}

	@Override
	public String toString() {
		return "Student roll number: "+getRoll()+"\n Student Name: "+getName()+"\nStudent City: "+getCity()+"\nStudent Marks: "+getMarks();
	} 	
	
	@Override
	public int compareTo(Student o) {
		return this.roll = o.roll;
	} 	
}
