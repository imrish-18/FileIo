package com.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
// jvm takes care everything and programmer  does not have any control
// in serialization we cann't save the part of the object to overcome this problem we should use externalization
class Employee implements Serializable
{	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	int id;
	String name;
	public Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
}

class Student implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	transient   int id;// it will save default value 
	transient  static int id1;// it will not change the value because it is applicable only on object not on class members
	String name;
	 final transient String clg;// it will not change the value to default
public Student(int id,String name,String clg)
{
	this.clg =clg;
	this.id=id;
	this.name=name;
}
}

public class SerializableImpl {

	public static void main(String args[]) throws IOException, ClassNotFoundException
	{
		Student std=new Student(1,"rishabh","ims");
		Student.id1=1;
	Employee emp=new Employee(1,"rishabh");
		FileOutputStream file=new FileOutputStream("D:\\rish\\ab.txt");
		FileInputStream fileInputStream=new FileInputStream("D:\\rish\\ab.txt");
		ObjectOutputStream out=new ObjectOutputStream(file);
		// in which order we serialized then we have to deserialized 
		//in same order ohterwise we will get class cast exception
		out.writeObject(std);
		out.writeObject(emp);
		file.close();
		ObjectInputStream in=new ObjectInputStream(fileInputStream);
		Student st=(Student) in.readObject();
		System.out.println(st.name);
		System.out.println(st.id);
		System.out.println(Student.id1);
		System.out.println(std.clg);
		Employee em=(Employee) in.readObject();
		System.out.println(em.id);
		System.out.println(em.name);
		in.close();
		
		
		
	}
}
