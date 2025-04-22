package Samplee.Interfaces;
import java.util.Set;
import java.util.HashSet;
public class Sets_Devils {

	public static void main(String[] args) {
		Set<String> devils=new HashSet<>();
		System.out.println("My empty set:"+devils);
		devils.add("A");
		devils.add("B");
		devils.add("C");
		devils.add("D");
		devils.add("E");
		System.out.println("My empty  set after adding:"+devils);
		devils.remove("C");
		System.out.println("My empty set after removing:"+devils);
		for(String temp:devils) {
			System.out.println("My empty set after using loop:"+temp);
		}
	}

}
