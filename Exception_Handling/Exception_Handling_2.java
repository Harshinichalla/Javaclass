package Samplee;

public class Exception_Handling_2 {

	public static void main(String[] args) {
		//String name="Harshi";
		//System.out.println("My name is:"+name.charAt(10));
		try {
			String name="Harshi";
			System.out.println("My name is:"+name.charAt(10));
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("My error:"+e);
		}

	}

}
