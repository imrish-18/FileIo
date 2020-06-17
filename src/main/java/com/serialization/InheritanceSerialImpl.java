package com.serialization;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id=5;
	String name;
	
}
class Dog extends Animal
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id=10;
	
}

class Shape
{
	int id=1;
	public Shape()
	{
		System.out.println("shape constructors is called");
	}
}
class Triagnle  extends Shape implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int  roll=10;
}

public class InheritanceSerialImpl {

	public static void main(String args[]) throws IOException, ClassNotFoundException
	{
		//Dog d=new Dog();
	//Shape s=new Shape();
		Triagnle t=new Triagnle();
		t.id=111;
		t.roll=1;
		FileOutputStream file=new FileOutputStream("D:\\rish\\ab.txt");
		FileInputStream fileInputStream=new FileInputStream("D:\\rish\\ab.txt");
		ObjectOutputStream out=new ObjectOutputStream(file);
		//out.writeObject(d);
		out.writeObject(t);
		ObjectInputStream in=new ObjectInputStream(fileInputStream);
		//Shape a=(Shape)in.readObject();
//		/Triagnle t1=(Triagnle)in.readObject();
		//Dog dog=(Dog)in.readObject();
		
		//System.out.println(dog.id);
		Triagnle t1=(Triagnle)in.readObject();
		System.out.println(t1.id);// we will get instance variable default value
		System.out.println(t1.roll);
	}
	
}
