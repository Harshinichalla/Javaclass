package Samplee;

import java.util.Scanner;

abstract class Apps1{       //Abstract parent class
	
	String mobile_number;
	String otp;
	
	void user_input() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter mobile_number:");
		mobile_number=s.next();
		System.out.println("Enter otp:");
		otp=s.next();
	}
	
	void user_login() {
		System.out.println("WELCOME TO WHATSAPP");
		System.out.println("====================");
		System.out.println("Please Login Here...!!");
	}
	abstract void app_open();  //Abstract method
	
}

class Whatsapp extends Apps1{     //child class
	//@override
	void app_open() {            //normal method
		while(true) {
			
		
		if(mobile_number.equals("1234567890") && otp.equals("123456")){
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
	
public class Main1 {

	public static void main(String[] args) {
	      Whatsapp w=new Whatsapp();
		w.user_login();
		w.user_input();
		w.app_open();
		

	}

}
