//Implementation of Abstraction
package Samplee;

import java.util.Scanner;


abstract class Apps{       //Abstract parent class
	
	String user_name;
	String password;
	
	void user_input() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter user name:");
		user_name=s.nextLine();
		System.out.println("Enter password:");
		password=s.nextLine();
	}
	
	void user_login() {
		System.out.println("WELCOME TO INSTAGRAM");
		System.out.println("====================");
		System.out.println("Please Login Here...!!");
	}
	abstract void app_open();  //Abstract method
	
}

class Instagram extends Apps{     //child class
	//@override
	void app_open() {            //normal method
		while(true) {
			
		
		if(user_name.equals("Harshini") && password.equals("123@")){
			System.out.println("App is opened successfully...!!");
			break;
		}
	else {
		System.out.println("Invalid Credentails,please Enter valid Credentails");
		user_input();
	}
		
		}
	}
}
	
public class Main {

	public static void main(String[] args) {
		Instagram i=new Instagram();
		i.user_login();
		i.user_input();
		
		
		i.app_open();
		

	}

}
