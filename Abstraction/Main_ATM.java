package Samplee;
import java.util.Scanner;
abstract class ATM{        //parent class
	double balance;        //Initial balance
	ATM(double balance){    //parent constructor
		this.balance=balance;
	}
    abstract void withDraw(double amount);
    abstract void deposit(double amount);
    abstract void checkBalance();
}

class UBI extends ATM{
	UBI(double balance){
		super (balance);
	}
	//withdraw method
	//@override
	void withDraw(double amount) {
		if (amount>0 && amount<=balance) {
			balance-=amount;
			System.out.println("withDraw success:Avaliable balance:"+balance);
		}else {
			
			System.out.println("Not available balance");
		
		}
	}
		//deposit method
	 void deposit(double amount) {
		 if (amount>0) {
			 balance+=amount;
			 System.out.println("Deposit success:Available balance:"+balance);
		 }else {
			 System.out.println("Not available balance");
		 }
	 }
	 //check balance
	 void checkBalance() {
		 System.out.println("Current Balance:"+balance);
	 }
	}



public class Main_ATM {

	public static void main(String[] args) {
	UBI obj =new UBI(2000);
	Scanner s=new Scanner(System.in);
	while(true) {
		System.out.println("****ATM MENU****");
		System.out.println("------------------");
		System.out.println("1.withdraw Money");
		System.out.println("2.Deposit Money");
		System.out.println("3.Check balance");
		System.out.println("4.Exit");
		System.out.println("Enter Your Choice:");
		int choice =s.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter withdraw amount:");
			double with_amount=s.nextDouble();
			obj.withDraw(with_amount);
			break;
		case 2:
			System.out.println("Enter deposit money:");
			double with_deposit=s.nextDouble();
			obj.deposit(with_deposit);
			break;
		case 3:
			System.out.println("Available balance");
			obj.checkBalance();
			break;
		case 4:
			System.out.println("Thank you visit again.....!!");
			System.exit(0);
		default:
			System.out.println("Enter correct option:");
		}
	}
	}

}
