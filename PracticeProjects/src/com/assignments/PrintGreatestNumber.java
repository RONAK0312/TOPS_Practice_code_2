package com.assignments;

import java.util.Scanner;

public class PrintGreatestNumber {
	
	public static void main(StringLitral[] args) {
		
		Scanner sc=new Scanner(System.in);
		double a,b,c;
		
		System.out.print("Enter A :");
		a=sc.nextDouble();
		System.out.print("Enter B :");
		b=sc.nextDouble();
		System.out.print("Enter C :");
		c=sc.nextDouble();
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is Max number :"+a);
			}
			else
			{
				System.out.println("C is Max number :"+c);
			}
		}
		else
		{
			if(b>c) 
			{
				System.out.println("B is Max number :"+b);
			}
			else
			{
				System.out.println("C is Max number :"+c);
			}
		}
		
	}

}
