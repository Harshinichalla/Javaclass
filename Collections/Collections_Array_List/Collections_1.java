//INSERTING ELEMENTS INTO THE EMPTY LIST AND REMOVING THE ELEMENTS
package Samplee.Interfaces;
import java.util.List;
import java.util.ArrayList;
public class Collections_1 {

	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList<>();
		System.out.println("My numbers list before:"+numbers);
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		System.out.println("My numbers list after adding elements:"+numbers);
		numbers.remove(2);
		System.out.println("My numbers list after removing:"+numbers);
		//ELEMENTS IN VERTICAL ORDER WE NEED TO USE ITERATORS
		for(int nums :numbers) {
		System.out.println("My numbers list using Iterators:"+nums);	
		}
	}

}

//for 10m-empty,adding,removing,vertical with syntax