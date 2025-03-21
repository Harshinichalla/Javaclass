package javasample;

public class Static {
       int a =10;//non-static or instance variable
       static int b=200; //static variable
       //methods
       public void non_static() {
    	   System.out.println("I'm non static or instance method");
       }
       public static void static1() {
    	   System.out.println("I'm a static method");
       }
	public static void main(String[] args) {
		Static m=new Static();
		System.out.println("a value:"+m.a); //req obj bcoz non-static or instance
		System.out.println("b value:"+b);
		//calling methods
		m.non_static();
		static1();
	}

}



