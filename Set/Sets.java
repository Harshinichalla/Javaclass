//SET AND HASHSET

package Samplee.Interfaces;
import java.util.Set;      //unordered,accept null values
import java.util.HashSet;


import java.util.TreeSet;    //Having order---->don't allow duplicates,don't accept null values

public class Sets {

	public static void main(String[] args) {
		Set<String> gods=new HashSet<>();
		System.out.println("My empty Set:"+gods);
		
		//ADDING
		gods.add("Ram");
		gods.add("Krishna");
		gods.add("Hanuman");
		gods.add("Shiva");
		gods.add("Ravan");
	   System.out.println("My empty set after adding:"+gods);
	   
	   
	   //REMOVE
	   gods.remove("Ravan");
	   System.out.println("My empty set after removing:"+gods);
	   
	   //USING LOOP
	   for(String temp:gods) {
		   System.out.println("My empty set using Loop:"+temp);
	   }

	}

}
