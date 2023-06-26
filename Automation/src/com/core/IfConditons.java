package com.core;

import java.util.Scanner;

public class IfConditons {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		double a,b;
		System.out.print("Enter value of A :");
		a=sc.nextDouble();
		if(a>0)
		{
			System.out.println("A is Positive number");	
		}
		else
		{
			System.out.println("A is Negative number");
		}
	
		// Check Odd and Even Number
		System.out.print("Enter value of B :");
		b=sc.nextDouble();
		if(b%2==0)
		{
				System.out.println("B is Even number");
			
		}
		else 
		{
			System.out.println("B is Odd number");
		}
	}

}
