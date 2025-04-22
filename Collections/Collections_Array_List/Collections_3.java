//Array and ArrayList
package Samplee.Interfaces;
import java.util.List;
import java.util.ArrayList;
public class Collections_3 {

	public static void main(String[] args) {
		//NORMAL ARRAY
		int[] numbers= {100,200,300,400,500};
		System.out.println("My numbers normal Array:"+numbers[3]);
		
		//ArrayList
		List<Integer> num=new ArrayList<>();
		System.out.println("My numbers list before:"+num);
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		System.out.println("My numbers list after adding elements:"+num);
		int temp=num.get(0);
		System.out.println("My numbers list:"+temp);
	}

}
