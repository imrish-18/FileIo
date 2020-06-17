package com.file;

import java.io.File;
import java.io.IOException;

public class FileIOImpl {

	public static void main(String[] args) throws IOException {
//	File f=new File("abc.txt");// won't create a physical file
//	System.out.println(f.exists());// check  file is created or not
//	f.createNewFile();//check if already available or not if available 
	//then return false else return true with a new specified file
     //System.out.println(f.exists());
//	File file=new File("rish");
//	System.out.println(file.exists());
//	file.mkdir();//check if already available or not if available 
//	//then return false else return true with a new specified dir
//	System.out.println(file.exists());
	File file=new File("D:\\rish");
	file.mkdir();
	File f=new File("D:\\rish","ab.txt");
	f.createNewFile();

	System.out.println(f.exists());
	System.out.println(f.isFile());//check it is file or not
	System.out.println(f.length());//return length of file
	//System.out.println(fl.delete());//delete a file
	String [] s=file.list();// return the list of file form a dir
	for(String st:s)
		System.out.println(st);
	

	}

}
