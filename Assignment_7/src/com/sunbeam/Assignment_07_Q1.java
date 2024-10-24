package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class StudentCityComparatorAsc implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2) {

		return o1.getCity().compareTo(o2.getCity());
	}
	
}

class StudentMarksComparatorDesc implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2) {

		return Double.compare(o2.getMarks(), o1.getMarks());
	}
	
}

class StudentNameComparatorAsc implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2) {

		return o1.getName().compareTo(o2.getName()); 
	}
	
}

// class StudentRollComparator implements Comparator<Student>
// {

// 	@Override
// 	public int compare(Student o1, Student o2) {
// 		// TODO Auto-generated method stub
// 		return o1.getRoll() - o2.getRoll();
// 	}	
// }

public class Assignment_07_Q1 {

	public static int menu(Scanner sc) 
	{
		System.out.println("0. EXIT");
		System.out.println("1. Accept Student details");
		System.out.println("2. Sort on Student City(Ascending)");
		System.out.println("3. Sort on Student Marks(Descending)");
		System.out.println("4. Sort on Student Name(Ascending)");
		System.out.println("5. Sort on Student Roll Number(Ascending)");
		System.out.println("-----------------------------------");
		System.out.println("Enter your Choice: ");
		return sc.nextInt();
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Student[] stud = new Student[5];
		int counter=0;
		
		Comparator<Student> comparator;
		
		int choice;
		
		while((choice = menu(sc)) != 0)
		{
			switch(choice)
			{
				case 0:
						System.exit(0);
				break;
					
				case 1:
					Student s1 = new Student();
						System.out.println("Enter student details: ");
						s1.accept(sc);
							stud[counter]=s1;
							counter++;
				break;
				
				case 2:
						Student s2 = new Student();
						comparator = new StudentCityComparatorAsc();
						Arrays.sort(stud, comparator);
							s2.display(stud);
				break;
				case 3:
						Student s3 = new Student();
						comparator = new StudentMarksComparatorDesc();
						Arrays.sort(stud, comparator);
						s3.display(stud);
				break;
				case 4:
						Student s4 = new Student();
						comparator = new StudentNameComparatorAsc();
						Arrays.sort(stud, comparator);
							s4.display(stud);
				break;
				case 5:
						Student s5 = new Student();
						// comparator = new StudentRollComparator();
						Arrays.sort(stud);
						s5.display(stud);
				break;
				
				default:
						System.out.println("Sorry Please TRY AGAIN!!");
				break;
			}
		}
	}
}
