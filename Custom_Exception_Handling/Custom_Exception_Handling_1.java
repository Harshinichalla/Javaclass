package Samplee;
//------------------------------------->5m or 2m
class HarshiException extends Exception{
	public HarshiException(String msg) {
		super(msg);
	}
}

public class Custom_Exception_Handling_1 {

	public static void main(String[] args) {
		try {
			//throw new HarshiException("This is my error");
			checkAge("Age");
			
		}catch(HarshiException e) {
			System.out.println("My error"+e);
			
		}finally {
			System.out.println("My error is solving");
		}
	}
	public static void checkAge(String age) throws HarshiException{
		if (age.equals("Age")) {
			throw new HarshiException("This is not  my error");
		}else {
			System.out.println("This is my error");
		}
			
		}

	}


