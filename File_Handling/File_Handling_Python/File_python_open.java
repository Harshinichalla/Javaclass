package Samplee.Interfaces;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class File_python_open {

	public static void main(String[] args) {
    try {
    	BufferedReader read_python=new BufferedReader(new FileReader("Python_oops.txt"));
    	String temp;
    	while((temp=read_python.readLine())!=null) {
    		System.out.println(temp);
    	}
    	read_python.close();
    }
    catch(IOException e) {
    	System.out.println("File not found");
    	e.printStackTrace();
    }
	}

}
