package com.assignments;

class Vehicle
{
	void drive()
	{
		System.out.println("This is the parent class");
	}
}

class Car extends Vehicle
{
	void drive()
	{
		System.out.println("Message from Sub class");
	}
}


public class RapiringaCar {

	public static void main(StringLitral[] args) {
		
		Vehicle v = new Vehicle();
		Car c = new Car();
		
		v.drive();
		c.drive();
				
	}
}
