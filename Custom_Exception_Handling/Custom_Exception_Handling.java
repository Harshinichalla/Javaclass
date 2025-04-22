package Samplee;
class HarshiniException extends Exception{
	public HarshiniException(String msg) {       //constructor
		super(msg);
	}
}

public class Custom_Exception_Handling {        //main class

	public static void main(String[] args) {
		try {
			throw new HarshiniException("My constructor");
		}catch(HarshiniException e) {
			System.out.println("My custom error:"+e);
		}finally {
			System.out.println("My custom error created successfully");
		}

	}

}

//exception handling keywords
//1)throw------>creating custom exception
//2)throws----->
//3)try------->
//4)catch------>
//5)finally----->