package com.core;

import java.util.Scanner;

public class LadderIf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int rno, s1, s2, s3, total;              	//Define Variables for RNo, Marks of Subjects and Total
		double per;									//Define Variable for Percentage
		String name;								//Define Variable for Student Name
		
		System.out.print("Enter Roll No");          //Take Roll No from User
		rno=sc.nextInt();
		System.err.print("Enter name of Student");  //Take Name from User
		name=sc.next();
		System.out.print("Marks of Sub 1:");		//Take Marks of Sub1 from User
		s1=sc.nextInt();
		System.out.print("Marks of Sub 2:");		//Take Marks of Sub2 from User
		s2=sc.nextInt();
		System.out.print("Marks of Sub 3:");		//Take Marks of Sub3 from User
		s3=sc.nextInt();
		
		total=s1+s2+s3;								//Total
		per = total/3;								//Percentage
			
		System.out.println("Roll number is :"+rno);
		System.out.println("Name is :"+name);
		System.out.println("Total is :"+total);
		System.out.println("Percentage is :"+per);
		
		// Ladder ifelse condtiotn to check class as per Percentage
		if(per>=70) 
		{
			System.err.println("Distinction :" +per);	
		} 
		else if(per>=60)
		{
			System.err.println("First Class :"+per);
		}
		else if (per>=50)
		{
			System.out.println("Second Class :"+per);
		}
		else if (per>=40)
		{
			System.out.println("Pass class :"+per);
		}
		else
			{
			System.out.println("Fail :"+per);
			}
		
	}
	
}
