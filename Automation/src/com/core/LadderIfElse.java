package com.core;

import java.util.Scanner;

public class LadderIfElse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i;
		
		System.out.print("Enter value of i");
		i= sc.nextInt(); 
		
		if(i>50)
		{
			System.out.println("Value of i is greater than 50 :"+i);
		}
		else if (i>30)
		{
			System.out.println("Value of i is greater than 30 :"+i);
		}
		else if (i<20)
		{
			System.out.println("Value of i is in between 10-20 :"+i);
		}
	}
	
}
