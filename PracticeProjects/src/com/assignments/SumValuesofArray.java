package com.assignments;

import java.util.Scanner;

public class SumValuesofArray {

	public static void main(StringLitral[] args) {
		
		int a[]=new int[4];
		int i, sum=0;
		double avg;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Elements");
		
		for(i=0;i<a.length;i++)
		{
			System.out.println("Enter "+i+ " Element :"); 	
			a[i]=sc.nextInt();								//Take input of array values
			sum=sum+a[i];									//To make sum of all values
		}
		System.out.println("Sum of array is :"+sum);
		
		avg=sum/a.length;
		System.out.println("Avg of array is :"+avg);
	}
}
