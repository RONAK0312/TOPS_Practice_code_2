package com.core;

class Box
{
	int width,height,depth;
	
	// Default Constructor
	Box()
	{
		System.out.println("Default constructor Called here");
		width = 3;
		height = 4;
		depth = 5;
	}
	
	// Parameteirsed Constructor
	Box (int w, int h, int d)
	{
		System.out.println("Here Parameteirsed caonstructor call");
		width = w;
		height = h;
		depth = d;
		
	}
	
	// User define Constructor
	void volume()
	{
		System.out.println("Volume of box is:" +(width*height*depth));
	}
}


public class Constructor {
	
	public static void main(String[] args) 
	{
		Box b1 = new Box();		//Create an object of Default Constructor
		b1.volume();			// Call a User defined method
		
		Box b2 = new Box (1,2,3); 	//Create an object of Parameterised Constructor
		b2.volume();				//Call a User defined method
		
		System.out.println("End of Main method");
	}

}
