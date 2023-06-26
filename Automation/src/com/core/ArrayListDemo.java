package com.core;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(10.23);
		al.add("tops");
		al.add('t');
		al.add(null);
		al.add(true);
		al.add(10);
		
		System.out.println(al);
		//Get Index
		System.out.println(al.get(3));
		
		//Add new element into list
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Array list element : ");
		int a=sc.nextInt();
		al.add(a);
		System.out.println(al);
		
		//Remove an element from the list
		System.out.print("Enter Index number to remove element : ");
		int index = sc.nextInt();
		al.remove(index);
		
		/*Scanner sc=new Scanner(System.in);
		System.out.print("Enter Array list element : ");
		String s=sc.nextString();
		al.add(a);
		System.out.println(al);*/
		
		System.out.println(al);
		System.out.println("Size of list is : "+al.size());
		
	}

}
