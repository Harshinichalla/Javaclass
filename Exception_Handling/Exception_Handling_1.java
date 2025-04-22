//ARRAY INDEX OUT OF BOUND EXCEPTION
package Samplee;

public class Exception_Handling_1 {

	public static void main(String[] args) {
		//int [] numbers = {1,2,3,4,5};
        //System.out.println("My array:"+numbers[5]);        
 
	  try {
		  int [] numbers = {1,2,3,4,5};
	        System.out.println("My array:"+numbers[5]);  
		}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("My error:"+e);
	}
	
	
	
	
	
	
	}
	
	
	
	
}
//not possible to print whole array in //------
//loop used to get whole array