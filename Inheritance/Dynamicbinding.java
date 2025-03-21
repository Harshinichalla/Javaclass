package javasample;
//Dynamic or late binding in polymorphism:
class Vehicles { // Parent class
 String name;
 String color;

 Vehicles(String name, String color) {
     this.name = name;
     this.color = color;
 }

 public void vehicles_details() {
     System.out.println("Vehicles Details:");
     System.out.println("Vehicle Name: " + name);
     System.out.println("Vehicle Color: " + color);
 }
}

class Car1 extends Vehicles { // Child class
 Car1(String name, String color) {
     super(name, color); // Calling the parent constructor
 }

 @Override
 public void vehicles_details() {
     System.out.println("Car1 Details:");
     System.out.println("Car Name: " + name);
     System.out.println("Car Color: " + color);
 }
}

class Car2 extends Vehicles { // Child class
 Car2(String name, String color) {
     super(name, color); // Calling the parent constructor
 }

 @Override
 public void vehicles_details() {
     System.out.println("Car2 Details:");
     System.out.println("Car Name: " + name);
     System.out.println("Car Color: " + color);
 }
}

public class Dynamicbinding {
 public static void main(String[] args) {
     Vehicles car1 = new Car1("Tesla", "Red"); // Dynamic binding
     car1.vehicles_details();

     Vehicles car2 = new Car2("BMW", "Blue"); // Dynamic binding
     car2.vehicles_details();
 }
}



 

