//EXCEPTION HANDLING
//ARITHMETIC EXCEPTION
//checked,unchecked,
//normal or built-in exception,custom exception(user-defined)
package Samplee;

public class Exception_Handling {

	public static void main(String[] args) {
		//int a=10;
		//int b=0;
		//int div =a/b;
		//System.out.println("Div of:"+div);
		
		
		try {     //throwing error
		int a=10;
		int b=0;
		int div=a/b;
		System.out.println("Div of:"+div);
		}
		catch(ArithmeticException e) {   //solving error            e------->error explanation
			System.out.println("My Error"+e);
		}
		finally {         //optional
			System.out.println("Error solving");
		}
			
		

	}

}
