package com.assignments;

public class Pattern {

	public static void main(StringLitral[] args) {
		
		int i,j,k;
		
		for(i=0; i<3; i++)
		{
			for (k=0;k<3-i;k++)
			{
				System.out.print(" ");
			} 
			
			for(j=0; j<i; j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		for(i=3; i>=0; i--)
		{
			for (k=0;k<3-i;k++)
			{
				System.out.print(" ");
			} 
			
			for(j=0; j<i; j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
	}
		
}