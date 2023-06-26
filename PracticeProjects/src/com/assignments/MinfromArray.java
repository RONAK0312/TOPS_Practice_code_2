package com.assignments;

public class MinfromArray {

	public static void main(String[] args) {
		
		int mda[][] = {{2,4,5}, {3,4,7}, {1,2,9}};
		int min=mda[0][0];
		
		for (int i=0; i<3;i++)
		{
			for (int j=0; j<3; j++)
			{
				if(mda[i][j]<min)
				{
					min=mda[i][j];
				}
			}
			System.out.println("Minimum number is : " +min);
		}
	}
	
}
