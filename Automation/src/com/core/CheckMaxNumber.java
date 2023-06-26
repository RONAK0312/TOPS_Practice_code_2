	package com.core;

import java.util.Scanner;

public class CheckMaxNumber {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	int a,b,c;
	System.out.print("Enters A");
	a=sc.nextInt();
	System.out.print("Enter B");
	b=sc.nextInt();
	System.out.print("Enter C");
	c=sc.nextInt();
	
	if(a>b)
	{
		if(a>c) 
		{
			System.out.println("A is grater");	
		}
		else 
		{
			System.out.println("C is grater");
		}
	}
	else 
	{
		if(b>c) 
		{
			System.out.println("B is grater");		
		}
		else 
		{
			System.out.println("C is grater");
		}
		
	}
	
	}
}
	
