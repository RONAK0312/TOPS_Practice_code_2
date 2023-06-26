package com.assignments;

import java.util.Scanner;

public class Table {
	
	public static void main(StringLitral[] args) {
		
		int a,i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		a = sc.nextInt();
		
		for (i=1; i<=10; i++)
		{
			System.out.println(a*i);
		}
		
	}

}
