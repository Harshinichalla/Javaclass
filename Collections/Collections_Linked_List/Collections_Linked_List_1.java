package Samplee.Interfaces;

import java.util.LinkedList;
import java.util.List;

public class Collections_Linked_List_1 {

	public static void main(String[] args) {
		List<String> heroines=new LinkedList<>();
		System.out.println("My Linked List:"+heroines);
		heroines.add("Sam");
		heroines.add("Keerthi");
		heroines.add("Raashi");
		heroines.add("Kiara");
		heroines.add("Alia");
		System.out.println("My Linked List after adding:"+heroines);
		//REMOVE
		heroines.remove(0);
		//GETTING PARTICULAR ELEMENT
		String temp=heroines.get(3);
		System.out.println("My Linked List:"+temp);
		//USING ITERATION
		for(String heroine:heroines) {
			System.out.println("My Linked List using Iteration:"+heroine);
		}
		//ADDING FIRST
		((LinkedList<String>)heroines).addFirst("Krithi");
		System.out.println("My Linked List Adding First:"+heroines);
		//ADDING LAST
		((LinkedList<String>)heroines).addLast("Sai Pallavi");
		System.out.println("My Linked List Adding Last:"+heroines);
	}
}
