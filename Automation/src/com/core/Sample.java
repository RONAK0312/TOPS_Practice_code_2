package com.core;

import java.util.Scanner; // Import Scanner from Java-Util used to receive input from the user

public class Sample {
	
	public static void main(String[] args) {
		//simple addition
		int a,b,c;
		a=10;
		b=20;
		c=a+b;
		System.out.println("The sum is :"+c);
		
		// Area of Circle with static value
		double pi=3.14, r=30.33, area;
		area = pi*r*r;
		System.out.println("Area of circle is :"+area);
		
		// Area of Circle with Dynamic variable
		Scanner sc=new Scanner(System.in);     // Creates the Object
		double pai=3.14, radious, area1;       // Defines the variable
		System.out.print("Enter Radious :");   // To get input from user
		radious=sc.nextDouble();			   // Defines the object to use functionality of Class
		area1 = pai*radious*radious;		   // Formula of Radious
		System.out.println("Area of circle is :"+area1);
	}
	
}
