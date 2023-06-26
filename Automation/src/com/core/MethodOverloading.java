package com.core;

public class MethodOverloading {

	void test()
	{
		System.out.println("Test with no argument");
	}
	
	void test(int a)
	{
		System.out.println("Test with 2 arguments");
	}
	
	void test(int a,double b)
	{
		System.out.println("Test with 3 arguments");
	}
	
	public static void main(String[] args) {
		
		MethodOverloading M = new MethodOverloading();
		M.test();
		M.test(10);
		M.test(20, 33.33);
		
	}
}
