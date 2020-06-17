package com.file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*we can any time of data to the file directly by using print writer*/
public class PrintWriterImpl {

	public static void main(String args[]) throws IOException
	{
		FileWriter fileWriter=new FileWriter("D:\\rish\\ab.txt");
		PrintWriter pw=new PrintWriter(fileWriter);
		//pw.write(100);
		pw.println(true);// can write any type of data
		pw.println(100);
		System.out.println();
		pw.close();
	}
}
