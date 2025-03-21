package javasample;
class Animal{   //parent
	public  void sound() {
		System.out.println("Animal Sounds");
	}
}
class Dog extends Animal{//child1
	//@Override
	public  void sound() {
		System.out.println("BOW BOW");
	}
}
class Cat extends Animal{  //child2
	public void sound() {
		System.out.println("MEOW MEOW");
	}
}

public class Runtimepolymorphism {

	public static void main(String[] args) {
		Dog d =new Dog();
		d.sound();
        Cat c=new Cat();
        c.sound();
	}

}
