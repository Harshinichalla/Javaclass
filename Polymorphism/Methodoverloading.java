package javasample;
class Addition{
	public void add() {
		int a=10;
		int b=20;
		System.out.println("Sum of a&b is:"+(a+b));
	}
public int add(int a,int b) {
	return a+b;
}
public int add(int a ,int b,int c) {
	return a+b+c;
}
}
public class Methodoverloading {

	public static void main(String[] args) {
     Addition a=new Addition();
     a.add();
     System.out.println("Sum of a and b:"+a.add(100,200));
     System.out.println("sum of a,b and c:"+a.add(100,200,300));

}
}
//parameters 
//change return type
//method name should be same

