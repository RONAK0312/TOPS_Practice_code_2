package com.assignments;

class Animal
{
	void makesound()
	{
		System.out.println("Animal makes the sound");
	}
}

class Cat extends Animal
{
	void makesound()
	{
		System.out.println("The cat quarrels.");
	}
}

public class MakeSound {
	
	public static void main(StringLitral[] args) {
		// TODO Auto-generated method stub

		Animal A = new Animal();
		Cat C = new Cat();
		
		A.makesound();
		C.makesound();
	}

}
