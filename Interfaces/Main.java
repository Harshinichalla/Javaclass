package Samplee.Interfaces;

interface Animal{ //class  is not required  when we are using the interface keyword
	abstract void sound();//method	
}
class Horse implements Animal{ 
	public void sound() {
		System.out.println("Woof Woof Woof....!!!");
	}
}
class Dog implements Animal{
	public void sound() {
		System.out.println("Bow Bow Bow....!!!");
	}
}
public class Main {

	public static void main(String[] args) {
		Horse h=new Horse();
		h.sound();
		Dog d=new Dog();
		d.sound();

	}

}
