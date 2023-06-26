package com.assignments;

import java.util.Scanner;

public class Factorial {

	public static void main(StringLitral[] args) {
		
		Scanner sc=new Scanner(System.in);
		int i,n,fact=1;
		
		System.out.print("Enter value of N");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factotial of" +n+ "is:"+fact);
	}
	
}
