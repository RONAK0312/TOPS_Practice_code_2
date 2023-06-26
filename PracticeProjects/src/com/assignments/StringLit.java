package com.assignments;

public class StringLit {
	
	public static void main(String[] args) {
		
				//Using New variable
				String s2 = new String("Text 1");
				String s3 = new String("Text 2");
				
				//String Litral
				String s = "Revishing RB the great";
				String[] splitedstings = s.split(" ");
				//String[] splitedstings = s.split("RB");
				
				System.out.println(splitedstings[0]);
				System.out.println(splitedstings[1]);
				System.out.println(splitedstings[2]);
				System.out.println(splitedstings[3]);
				
				System.out.println("************************");
				
				System.out.println(splitedstings[2].trim());
				System.out.println(splitedstings[3].trim());
				
				/*for (int i=0; i<s.length();i++)
				{
					System.out.println(s.charAt(i));
				}*/
				
				System.out.println("************************");
				
				//to print the string from last character
				/*for (int i=s.length()-1; i>=0;i--)
				{
					System.out.println(s.charAt(i));
				}*/
		
	}

}
