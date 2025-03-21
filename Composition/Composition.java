package Samplee.Interfaces;

class Engine{      //parent-1
	void start() {
		System.out.println("Engine is started");
	}
}
class Car{     //parent-2
	Engine e=new Engine();
	void stop() {
		System.out.println("Engine is stopped");
		e.start();
	}
	void move() {
		System.out.println("Car is moving");
	}
}
public class Composition { //main class

	public static void main(String[] args) {
		Car c=new Car();
		c.stop();
		c.move();
	}

}
//is----->used in inheritance
//as----->used in composition
