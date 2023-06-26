package com.assignments;

import java.util.Scanner;

public class StaticVariable {
	
	static int a;
	static int b=10, s, m;
	void setValue()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of A :");
		a=sc.nextInt();
	}
	
	void printValue()
	{
		System.out.println("Value of A is :" +a);
	}
	
	 void sum() 
	{
		 s = a+b;
		 //System.out.println("Value of sum is :" +s);
	}
	
	 void mul()
	{
		 m = a*b;
	}

	public static void main(StringLitral[] args) {
		
		StaticVariable s1 = new StaticVariable();
		
		s1.setValue();
		s1.printValue();
		s1.sum();
		s1.mul();
		
		System.out.println("Value of sum is :" +s);
		System.out.println("Value of mul is :" +m);
	}
}
