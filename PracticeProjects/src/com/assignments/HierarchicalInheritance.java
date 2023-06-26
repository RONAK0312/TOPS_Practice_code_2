package com.assignments;

import java.util.Scanner;

class parent
{
	  int a=5;
	  	
	  /*void SetA()
	  {
		  /*Scanner sc=new Scanner(System.in);
		  System.out.print("Enter value of A :");
		  a=sc.nextInt();
	  }*/
	  
	  void PrintA()
	  {
		  System.out.println("Value of A is :"+a);
	  }
	  
}

class child1 extends parent
{
      int b;
      void SetB()
      {
    	  Scanner sc=new Scanner(System.in);
		  System.out.print("Value of B is :");
		  b=sc.nextInt();
      }
      void PrintB()
	  {
		  System.out.println("Value of B is :"+b);
	  }
}

class child2 extends parent
{
      int c;
      void SetC()
      {
    	  Scanner sc=new Scanner(System.in);
		  System.out.print("Enter value of C :");
		  c=sc.nextInt();
      }
      void PrintC()
	  {
		  System.out.println("Value of C is :"+c);
	  }
}



public class HierarchicalInheritance {

	public static void main(StringLitral[] args) {
		
		child1 c1 = new child1();
		//c1.SetA();
		c1.SetB();
		
		//c1.PrintA();
		//c1.PrintB();
		
		child2 c2 = new child2();
		//c2.SetA();
		c2.SetC();
		
		//c2.PrintA();
		//c2.PrintC();
		
		System.out.println("Sum of Child 1 is : " +(c1.a + c1.b));
		System.out.println("Sum of Child 2 is : " +(c2.a + c2.c));
		
	}
	
}
