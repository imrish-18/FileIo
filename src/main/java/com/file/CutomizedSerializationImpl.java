package com.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name="virat";
	 transient String pwd="26759";
	 
	 transient int pin=132;
	 private void writeObject(ObjectOutputStream os) throws IOException
	 {
		 os.defaultWriteObject();
		 String epws="123"+pwd;
		 int epin=123+pin;
		 os.writeObject(epws);
		 os.writeInt(epin);
		 
	 }
	 private void readObject(ObjectInputStream oi) throws ClassNotFoundException, IOException
	 {
		 oi.defaultReadObject();
		 String epws=(String)oi.readObject();
		 pwd=epws.substring(3);
		 int epin=(int)oi.readInt();
		 pin=epin-123;
		 
	 }
}

public class CutomizedSerializationImpl {

	public static void main(String args[]) throws IOException, ClassNotFoundException
	{
		Account a=new Account();
		FileOutputStream file=new FileOutputStream("D:\\rish\\ab.txt");
		FileInputStream fileInputStream=new FileInputStream("D:\\rish\\ab.txt");
		ObjectOutputStream out=new ObjectOutputStream(file);
	
		out.writeObject(a);
		ObjectInputStream in=new ObjectInputStream(fileInputStream);
		Account st=(Account) in.readObject();
		System.out.println(st.name);
		System.out.println(st.pwd);
		System.out.println(st.pin);
		in.close();
		out.close();
		
		
	}
}
