//MAPS--->
//it is nothing but a dictionary,don't allow duplicates
package Samplee.Interfaces;
import java.util.Map;
import java.util.HashMap;

public class Maps {

	public static void main(String[] args) {
		Map<String,Integer> birds=new HashMap<>();
		System.out.println("My empty map:"+birds);
		
		//ADDING
		
		birds.put("Pigeon",1);
		birds.put("Parrot", 2);
		birds.put("Peacock", 3);
		birds.put("Humming bird",4);
		birds.put("Sparrow", 5);
		System.out.println("My empty map after adding:"+birds);
		
		//REMOVE
		birds.remove("Humming bird");
		System.out.println("My empty map after removing:"+birds);
		
		//FOR LOOP
		for(Map.Entry<String,Integer>  entry:birds.entrySet()) {
			System.out.println("Keys:=>"+entry.getKey()+","+"Values:=>"+entry.getValue());
		}

	}

}
