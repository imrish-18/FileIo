package com.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

// it is use to  overcome the problem \n that comes in file writer
public class BufferedWriterImpl {

	public static void main(String[] args) throws IOException {
 
		FileWriter fileWriter=new FileWriter("D:\\rish\\ab.txt",true);
		//Writer wr=fileWriter;
		  // it cann't communicate with file directly;
		BufferedWriter bw=new BufferedWriter(fileWriter);
		bw.write(100);
		bw.newLine();
		bw.write("rishabh");
		bw.newLine();
		bw.flush();
		bw.close();
		//fileWriter.close(); whenever we are closing buffered writer it will automatically closed
	    FileReader fileReader=new FileReader("D:\\rish\\ab.txt");
		BufferedReader reader=new BufferedReader(fileReader);
		System.out.println(reader.readLine());
		while(reader.readLine()!=null)
		{
			System.out.println(reader.readLine());
		}
		reader.close();
		

	}

}
