package com.sunbeam;

import java.util.Scanner;

public class Invoice 
{
	private String partNo;
	private String partName;
	private double quantity;
	private double price;
	
	public Invoice() 
	{
		this.partNo = "";
		this.partName = "";
		this.quantity = 0.0;
		this.price = 0.0;
	}

	public Invoice(String partNo, String partName, double quantity, double price) 
	{
		this.partNo = partNo;
		this.partName = partName;
		this.quantity = quantity;
		this.price = price;
	}

	public String getPartNo() {
		return partNo;
	}

	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public double getQuantity() {
		
		return quantity;
	}

	public void setQuantity(double quantity) {
	if(quantity < 0)
	{
		System.out.println("quantity cannot be negative!!");
	}
	else
	{			
		this.quantity = quantity;
//		quantity = sc.nextDouble();
	}

	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price < 0)
		{
			System.out.println("Price cannot be negative!!");
		}
		else
		{			
//			price = sc.nextDouble();
			this.price = price;
		}			
	}
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter part number: ");
		partNo = sc.next();
		System.out.println("Enter part name: ");
		partName = sc.next();
		System.out.println("Enter quantity: ");
		quantity = sc.nextDouble();
		System.out.println("Enter part price: ");
	}
	
	double totalPrice()
	{
		double amt;
		
		amt = getPrice() * getQuantity();
		
		return amt;
	}
	
	public void Menu()
	{		
		System.out.println("Part Number\tPart Name\tQuantity\tPrice");
	}
	
	public void display()
	{
		System.out.println(getPartNo()+"\t"+getPartName()+"\t"+getQuantity()+"\t"+getPrice());
	}
}













