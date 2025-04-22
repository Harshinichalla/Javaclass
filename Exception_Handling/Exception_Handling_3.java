//NULL POINTER EXCEPTION
package Samplee;

public class Exception_Handling_3 {

	public static void main(String[] args) {
		//String name=null;
		//System.out.println("My name is:"+name.length());
		
		try {
			String name=null;
			System.out.println("My name is:"+name);
			}catch(NullPointerException e) {
				System.out.println("My error:"+e);
			}

	}

}
