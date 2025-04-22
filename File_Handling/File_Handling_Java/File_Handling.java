package Samplee.Interfaces;
import java.io.FileWriter;
import java.io.IOException;
public class File_Handling {

	public static void main(String[] args) {
    try {
    	FileWriter java=new FileWriter("Java.txt");
    	java.write("Java is high level,"+"programming language");
    	java.close();
    	System.out.println("File created Successfully");
    }
    catch(IOException e) {
    	System.out.println("File not found");
    	e.printStackTrace();              //to fetch the file location
    }
	}

}
