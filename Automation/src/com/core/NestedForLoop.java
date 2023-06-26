package com.core;

public class NestedForLoop {
	
	public static void main(String[] args) {
		
		int a, b;
		for (a=4; a>=0; a--) 
		{
			for (b=0; b<=a; b++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
