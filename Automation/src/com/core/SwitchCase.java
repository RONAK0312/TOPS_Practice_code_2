package com.core;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		int a,b,c,d;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A :");
		a=sc.nextInt();
		System.out.print("Enter B :");
		b=sc.nextInt();
		
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		
		System.out.println("Enter your choice");
		d=sc.nextInt();
		
		switch(d)
		{
			case 1:
				c=a+b;
				System.out.println("Sum is : "+c);
				break;
				
			case 2:
				c=a-b;
				System.out.println("Sub is :"+c);
				break;
				
			case 3:
				c=a*b;
				System.out.println("Multiplication is :"+c);
				break;
				
			case 4:
				c=a/b;
				System.out.println("Division : "+c);
				break;
			
			default:
				System.out.println("Invalid Choise");
				break;
		
		}
	}
	
}
