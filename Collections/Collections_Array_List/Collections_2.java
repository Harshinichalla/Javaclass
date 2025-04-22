package Samplee.Interfaces;
import java.util.List;
import java.util.ArrayList;
public class Collections_2 {

	public static void main(String[] args) {
    List<String> flowers=new ArrayList<>();
    System.out.println("My flowers list before:"+flowers);
    flowers.add("Rose");
    flowers.add("Marigold");
    flowers.add("Tulip");
    flowers.add("Jasmine");
    flowers.add("Sunflower");
    flowers.add("Hibsicus");
    flowers.add("Lily");
    flowers.add("Daisy");
    flowers.add("Lotus");
    flowers.add("Orchid");
    System.out.println("My flowers list after:"+flowers);
    flowers.remove(6);
    flowers.remove(3);
    System.out.println("My flowers after removing:"+flowers);
    //VERTICAL ORDER USING ITERATORS
    for( String flo:flowers) {
    	System.out.println("My flowers using iterators:"+flo);
    }


	}

}
