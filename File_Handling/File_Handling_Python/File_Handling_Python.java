package Samplee.Interfaces;
import java.io.FileWriter;
import java.io.IOException;

public class File_Handling_Python {

	public static void main(String[] args) {
		try {
			FileWriter python=new FileWriter("Python_oops.txt");
			python.write("Python oops concepts are:"+"Inheritance,abstraction,.encapsulation");
			python.close();
			System.out.println("File created successfully");
		}
		catch(IOException e) {
			System.out.println("File not found");
			e.printStackTrace();
		}

	}

}
