package Samplee;

public class All_Exception_Handling {

	public static void main(String[] args) {
		try {
			//ARITHMETIC EXCEPTION  -------->1
			int div =10/0;
			
			//ARRAY INDEX OUT OF BOUNDS EXCEPTION -------->2
			int []numbers= {1,2,3,4,5};
			System.out.println("My numbers:"+numbers[10]);
			
			//STRING  INDEX OUT OF BOUNDS EXCEPTION ------->3
			String name="Harshi";
			System.out.println("My name:"+name.charAt(15));
			
			//NULL POINTER EXCEPTION --------->4
			
			String name1=null;
			System.out.println("My string:"+name1.length());
			
			}catch(ArithmeticException e) {
			     System.out.println("My First Exception:"+e);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("My Second Exception:"+e);
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("My Third Exception:"+e);
		}catch(NullPointerException e) {
			System.out.println("My Fourth Exception:"+e);
		}finally {
			System.out.println("My Four Exceptions is solving");
		}
	}
}
//one try block throws only one error at a time 