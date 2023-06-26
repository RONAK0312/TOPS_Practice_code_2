package com.core;

class student
{
	int rno;
	String sname;
	
	public student ()
	{
		System.out.println("Default Constructor called");
	}
	
	student (int rno, String sname)
	{
		this();
		System.out.println("Parametetised Constructor called");
		this.rno = rno;
		this.sname = sname;
	}
	void show(student s)
	{
		System.out.println("Roll No :" +s.rno);
		System.out.println("Student Name :" +s.sname);
	}
	void display()
	{
		show(this);
	}
	
}

public class ThisDemo {

	public static void main(String[] args) {
		
		student s1 = new student(3, "RB");
		//s1.show(s1);
		s1.display();
	}
}
