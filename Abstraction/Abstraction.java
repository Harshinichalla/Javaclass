package Samplee;

abstract class Flowers{      //parent
abstract void smell(); //abstract method doesn't have any body
}

class Rose extends Flowers{
	//@override
	void smell(){          //normal method
		System.out.println("Rose smell");
		
		}
}

class Jasmine extends Flowers{
	//@override
	void smell() {
		System.out.println("Jasmine smell");
	}
}


public class Abstraction {

	public static void main(String[] args) {
	Rose r=new Rose();
	r.smell();
	
	Jasmine j=new Jasmine();
	j.smell();

	}

}
