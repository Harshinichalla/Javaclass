package javasample;                  //CTP-COMPILETIMEPOLYMORPHISM,RTP-RUNTIME

public class Polymorphism {
	public static int add(int a, int b) {    //method 1
		 return a+b;
	}
	public static double add(double a,double b) {
		return a+b;        //method 2
	}

	public static void main(String[] args) {
		System.out.println("method1:"+add(10,20));
		System.out.println("method2:"+add(100,200));

	}

}


//RTP


