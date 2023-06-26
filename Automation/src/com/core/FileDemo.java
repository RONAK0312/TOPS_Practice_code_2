package com.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {

public static void main(String[] args) throws IOException {
	
	//Creates new file and write data into the file
	FileOutputStream fos = new FileOutputStream("tops1.txt");
	String s = "This is file output stream demo using java";
	//Convert the characters into byte
	byte b[] = s.getBytes();
	fos.write(b);
	//To clear Stream
	fos.flush();
	// To close
	fos.close();
	System.out.println("File written succesfully");
	
	//To read the text and print into Console
	FileInputStream fis = new FileInputStream("tops1.txt");
	int i;
	String str="";
	//To read all the characters from file
	while ((i=fis.read())!=-1)
	{
		System.out.print((char)i);
		str = str+(char)i;
	}
	System.out.println(str);
	fis.close();
	System.out.println();
	System.out.println("String is  :" +str);
	
	FileOutputStream fos1 = new FileOutputStream("D:\\Automation_Practice\\AutoWrite.txt");
	byte b1[] = str.getBytes();
	fos1.write(b1);
	fos1.flush();
	fos1.close();
	System.out.println("File created successfully");
	
}
	
	
}
