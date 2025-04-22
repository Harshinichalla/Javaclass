package Samplee.Interfaces;
import java.util.Map;
import java.util.TreeMap;
public class Map_TreeMap {

	public static void main(String[] args) {
		Map<String,Integer> employees=new TreeMap<>();
		System.out.println("My empty map:"+employees);
		employees.put("Harshini", 01);
		employees.put("Harsha", 02);
		employees.put("Hari", 03);
		employees.put("Kalyan", 04);
		employees.put("Jashu", 05);
		System.out.println("My empty map after adding:"+employees);
		employees.remove("Jashu");
		System.out.println("My empty map after removing:"+employees);
		for(Map.Entry<String,Integer>  entry:employees.entrySet()) {
			System.out.println("Keys:=>"+entry.getKey()+","+"Values:=>"+entry.getValue());

		}


	}

}



//employee--->put,remove,for---->emp name,emp id