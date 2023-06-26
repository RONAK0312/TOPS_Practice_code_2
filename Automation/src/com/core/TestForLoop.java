package com.core;

import java.util.Scanner;

public class TestForLoop {

	public static void main(String[] args) {
		
		int i,n;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter value of N : ");
		n=sc.nextInt();
		
		for(i=1; i<=n; i=i+3)						// To Print Even number (i=0; i<=n; i=i+2) and for Odd number (i=1; i<=n; i=i+2) 
		{
			System.out.println(i);
		}
		System.out.println("End of the Loop");
	}
	
}
