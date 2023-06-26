package com.assignments;

import java.util.Scanner;

public class MaxandMinofArray {
	
	public static void main(StringLitral[] args) {
		
		int a[]=new int[3];
		int i, j;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements");
		
		for(i=0;i<a.length;i++)
		{
			System.out.println("Enter "+i+ " Element :"); 	
			a[i]=sc.nextInt();								//Take input of array values
		}
		
		if(a[i]>a[j])
		{
			System.out.println(a[i]+ "is Max");
		}
		else
		{
			System.out.println(a[j]+ "is Min");
		}
		
	}

}
