package com.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable
{	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Cat c=new Cat();
	
}
class Cat implements Serializable
{
	Rat r=new Rat();
}

class Rat implements Serializable
{
	int id=20;
}
public class ObjectGraphImpl {

	public static void main(String arsg[]) throws IOException, ClassNotFoundException
	{
		// every object should be serialized otherwise we will get run time exception saying not serialized
		Dog d=new Dog();
		FileOutputStream file=new FileOutputStream("D:\\rish\\abc.txt");
		FileInputStream fileInputStream=new FileInputStream("D:\\rish\\abc.txt");
		ObjectOutputStream out=new ObjectOutputStream(file);
		out.writeObject(d);
		out.close();
		ObjectInputStream in=new ObjectInputStream(fileInputStream);
		Dog st=(Dog) in.readObject();
		System.out.println(st.c);
		in.close();
	}
}
