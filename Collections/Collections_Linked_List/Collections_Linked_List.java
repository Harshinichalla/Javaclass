package Samplee.Interfaces;

import java.util.LinkedList;
import java.util.List;
public class Collections_Linked_List {

	public static void main(String[] args) {
		List<String> heroes=new LinkedList<>();
		System.out.println("My Linked List:"+heroes);
		heroes.add("NTR");
		heroes.add("RAM CHARAN");
		heroes.add("ALLU ARJUN");
		heroes.add("PRABHAS");
		heroes.add("BHARATH");
		System.out.println("My Linked List after adding:"+heroes);
		//REMOVE
		heroes.remove(4);
		//GETTING PARTICULAR ELEMENT
		String temp=heroes.get(3);
		System.out.println("My Linked List:"+temp);
		//USING ITERATION
		for(String hero:heroes) {
			System.out.println("My Linked List using Iteration:"+hero);
		}
		//ADDING FIRST
		((LinkedList<String>)heroes).addFirst("Ram");
		System.out.println("My Linked List Adding First:"+heroes);
		//ADDING LAST
		((LinkedList<String>)heroes).addLast("Akhil");
		System.out.println("My Linked List Adding Last:"+heroes);


	}

}
