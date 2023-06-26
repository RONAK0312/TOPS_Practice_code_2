package com.assignments;

import java.util.Scanner;

class Shape
{
	double l,b;
	
	void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter lenght");
		l=sc.nextDouble();
		System.out.print("Enter breadth");
		b=sc.nextDouble();
		
	}
}

class Rectangle extends Shape
{
	double area;
	void getArea()
	{
		area = l*b;
		System.out.println("Area of Rect is :" +area);
	}
}


public class AreaofRectangle {
	
	public static void main(StringLitral[] args) {
		
		Rectangle r = new Rectangle();
		
		r.getData();
		r.getArea();
	}
 
}
