package Samplee;

public class Array_Exception_Handling {

	public static void main(String[] args) {
		//String [] fruits={"Mango","Banana","Strawberry","Kiwi","Watermelon"};
		//System.out.println("My fruits:"+fruits);
		try {
			String [] fruits={"Mango","Banana","Strawberry","Kiwi","Watermelon"};
			System.out.println("My fruits:"+fruits[10]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("My error is:"+e);
		}finally {
			System.out.println("My error is solving");
		}
	}

}
