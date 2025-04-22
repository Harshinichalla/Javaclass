//FILE OPEN AND READ

package Samplee.Interfaces;

import java.io.FileReader;
import java.io.BufferedReader;        //to fetch the file one place to another---->ex:UK ---->USA
import java.io.IOException;

public class File_open {

	public static void main(String[] args) {
    try {
    	BufferedReader read_java=new BufferedReader(new FileReader("Java.txt"));
    	String temp;
    	while((temp=read_java.readLine())!=null) {           //read every line in the file--->readLine
    		System.out.println(temp);
    	}
    	read_java.close();
    }
    catch(IOException e) {
    	System.out.println("File not found");
    	e.printStackTrace();
    }
	}

}
