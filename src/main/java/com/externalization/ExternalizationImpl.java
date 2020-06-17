package com.externalization;
import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Random;

// to save the part of object and programmer has control that's why we use externalization
// child interface of serializable interface 1.1v
//transient no need of this keyword because programmer has control 
class Account implements Externalizable
{

	String name;
	int id;
	int ac;
	// if there is non-args constructor then we will get run time exception saying no valid constructor
	public Account()
	{
		
	}
	public Account(int id,String name,int ac)
	{
		this.id=id;
		this.ac=ac;
		this.name=name;
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		 name=(String)in.readObject();
		 id=in.readInt();
		
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		
		out.writeObject(name);
        out.writeInt(id);		
	}
	
}
public class ExternalizationImpl {

	public static void main(String args[]) throws IOException, ClassNotFoundException
	{
		Random ran=new Random();
		
		Account account =new Account(1,"rishabh",ran.nextInt());
		FileOutputStream file=new FileOutputStream("D:\\rish\\ab.txt");
		FileInputStream fileInputStream=new FileInputStream("D:\\rish\\ab.txt");
		ObjectOutputStream out=new ObjectOutputStream(file);
		out.writeObject(account);
		ObjectInputStream in=new ObjectInputStream(fileInputStream);
		Account ac=(Account)in.readObject();
		System.out.println(ac.ac);
		System.out.println(ac.id);
		System.out.println(ac.name);
		System.out.println(account.ac);
		out.close();
		in.close();
		
	}
}
