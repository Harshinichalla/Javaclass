package Samplee;

class HarException extends Exception{
	public HarException (String message) {
		super (message);
	}
}
public class Custom_Exception_Handling_2 {

	public static void main(String[] args) {
		//throw new HarshiException("This is my error");
		try {
		checkAge("Vote");
		
	}catch(HarException e) {
		System.out.println("My error"+e);
		
	}finally {
		System.out.println("My error is solving");
	}
}
public static void checkAge(String age) throws HarException{
	if (age.equals("Vote")) {
		throw new HarException("You are eligible to vote");
	}else {
		System.out.println("You are not eligible to vote");
	}
		
	}

	}


