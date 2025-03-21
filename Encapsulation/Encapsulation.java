package javasample;
class Main{    //user-defined class
	private static String name1="Harshi";
	private static String name2;
	
	public String getName1() {  //getter method
		return name1;
	}
	
	public String getName2() {
		return name2;
	}
	public void setName2(String name2) {
		this.name2=name2;
	}
}
public class Encapsulation {
private static int a=100;
	public static void main(String[] args) {
	System.out.println("a value:"+a);
	Main m=new Main();
	
	System.out.println("My name:"+m.getName1());
	m.setName2("Harshini");
	System.out.println("My name is:"+m.getName2()); 

	}

}
