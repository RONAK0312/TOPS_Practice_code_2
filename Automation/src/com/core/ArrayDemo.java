package com.core;

import java.util.Scanner;

public class ArrayDemo {
    
	public static void main(String[] args) {
		int a[]=new int[5]; 								//Defining the array
		int i, sum=0, j, temp;								//Define the variable to store and compare
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Elements");
		
		for(i=0;i<a.length;i++)								//"a.length" is used to handle array dynamic array length
		{
			System.out.println("Enter "+i+ " Element :"); 	
			a[i]=sc.nextInt();								//Take input of array values
			sum=sum+a[i];									//To make sum of all values
		}
		System.out.println("Array Elements are ");
		
		for(i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]="+a[i]);           // Print values of array with its index
		}
		System.out.println("Sum of array is :"+sum);		//To Print Sum of Array
		
		// To Print in Ascending Order
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j]) 								//Check the values of indexes
				{
					temp=a[i];								//Store the index value in temp variable
					a[i]=a[j];								//Swap both values
					a[j]=temp;								//Store value of next index into temp variable after swaping
				}
			}
		}
		System.out.println("Ascending order of array is");
		for(i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]="+a[i]);
		}
		
		// To Print in Descending Order
				for(i=0;i<a.length;i++)
				{
					for(j=i+1;j<a.length;j++)
					{
						if(a[i]<a[j]) 
						{
							temp=a[i];
							a[i]=a[j];
							a[j]=temp;			
						}
					}
				}
				System.out.println("Descending order of array is");
				
				for(i=0;i<a.length;i++)
				{
					System.out.println("a["+i+"]="+a[i]);
				}
	}
}
