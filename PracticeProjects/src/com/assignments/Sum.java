package com.assignments;

import java.util.Scanner;

public class Sum {

	public static void main(StringLitral[] args) {
		
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of A :");
		a=sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter value of B :");
		b=sc1.nextInt();
		
		c=a+b;
		System.out.println("Sum is = "+c);
				
	}
}
