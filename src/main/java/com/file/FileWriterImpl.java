package com.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterImpl {

	public static void main(String[] args) throws IOException {
		// to write some character or text data to file then we should file writer
		// if file is not available then file writer will create a new file
		
		//FileWriter fileWriter=new FileWriter("D:\\rish\\ab.txt");// old data will overridden always 
		FileWriter fileWriter=new FileWriter("D:\\rish\\ab.txt",true);// to append the data

//		fileWriter.write("rish");
//		fileWriter.append('a');
		//fileWriter.write(101);////write(int char) to write a char into file 
		//fileWriter.write("\n");
		 fileWriter.write("rishabh");// to write a string into file
		//fileWriter.flush();// give guarantee that total data including last character written to file properly
		 fileWriter.close();
           FileReader fileReader=new FileReader("D:\\rish\\ab.txt");// to read character data from the file
        //int read() to read char data from file and int is unicode value
           char[] ch=new char[200];
           int i=fileReader.read();
           while(i!=-1)
           {
        	   System.out.println((char)i);
        	   i=fileReader.read();
           }
          // fileReader.read(ch);
//           for(int i=0;i<ch.length;i++)
//        	   System.out.println((char)ch[i]);
           fileReader.close();
       
	

	}

}
