package com.core;

//Creates two interfaces
interface ifs1
{
	static void meth1()
	{
		System.out.println("Meth 1 is defined into interface ifs 1");
	}
}

//Inherit the intrface
interface ifs2 extends ifs1
{
	void meth2();
}

// Create a class to implements the interface
class IfsDemo1 implements ifs1, ifs2 //Implements more than one interfaces
{
	//Define the body of the method
	public void meth1() 
	{
		System.out.println("Meth 1");
	}
	
	public void meth2() 
	{
		System.out.println("Meth 2");
	}
	
}

//Create another class to implements the Interface
class IfsDemo2 implements ifs2 // 
{
	/*public void meth1() 
	{
		System.out.println("Meth 1 in Ifs2");
	}*/
	
	public void meth2() 
	{
		System.out.println("Meth 2 in Ifs2");
	}
}

public class InterfaceDemo {
	
	public static void main(String[] args) {
	
		IfsDemo1 i1 = new IfsDemo1();
		//i1.meth1();
		i1.meth2();
		
		IfsDemo2 i2 = new IfsDemo2();
		//i2.meth1();
		i2.meth2();
		
		//As static method is belongs to its parent class, here we have create an object of its parent Interface
		ifs1.meth1();
		
		
	}

}
