package com.core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student1 implements Serializable
{
	int rno;
	String sname;
	double per;
	
	//Parameterised Constructor
	public Student1(int rno, String sname, double per) 
	{
		this.rno = rno;
		this.sname = sname;
		this.per = per;
	}
	
	//Use to print an object of the class Student1
	public String toString()
	{
		return "Roll no : "+rno+"\nName of student :"+sname+"\nPercentage :"+per;
	}
		
}

public class Serialization {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Student1 s1 = new Student1(03, "RB", 89);
		
		FileOutputStream fos =  new FileOutputStream("Ser");
		//Used to write an Object in file
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.flush();
		oos.close();
		System.out.println("Object Written successfully");
		
		FileInputStream fis =  new FileInputStream("ser");
		////Used to read an Object in file
		ObjectInputStream ois = new ObjectInputStream(fis);
		//Cast used to covert from one type to another type
		Student1 s2 = (Student1) ois.readObject();
		ois.close();
		System.out.println(s2);	
		
	}

}
