package com.core;

import java.util.Scanner;

public class NestedIf {

public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	double Physics,Chemistry,Maths;
	
	System.out.print("Enter Physics Marks");
	Physics=sc.nextDouble();
	System.out.print("Enter Chemistry Marks");
	Chemistry=sc.nextDouble();
	System.out.print("Enter Maths Marks");
	Maths=sc.nextDouble();
	
	if(Physics>Chemistry) 
	{
		if(Physics>Maths) 
		{
			System.out.println("physics marks is higher");
		}
		else 
		{ 
			System.out.println("Maths marks is higher");
		}
	}
	else 
		{
		  if(Chemistry>Maths)
		  {
			  System.out.println("Chamistry is higher");
		  }
		  else
		  {
			  System.out.println("Maths is highter");
		  }
		}
	
	}
}
