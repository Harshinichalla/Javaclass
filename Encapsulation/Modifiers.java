package javasample;

class Modi{ //user defined class
	public int a=100;
	
	protected int b=200;
	
	int c=300;
	
	private String d; /*="Harshini"*/ //without passing value
	
	public String getName() {//getter method
		return d;
	}
	public void setName( String d) {//setter method
		this.d=d;
	
	}
	
	
}

public class Modifiers {  //main class
      public static int a =100;   //public used anywhere 
      
      protected int b=200;    //non-static same within the package it is accessible
      
      int c=300; //default
      
      private String d="Harshini";//private
      
	public static void main(String[] args) {
		Modifiers m =new Modifiers();
		
		System.out.println("a value is :"+m.a);
        System.out.println("b value is :"+m.b);
        System.out.println("c value is :"+m.c);
        System.out.println("My name is :"+m.d);
        
        //user defined class object
        Modi m1 = new Modi(); 
        System.out.println("a value is :"+m1.a);
        System.out.println("b value is :"+m1.b);
        System.out.println("c value is :"+m1.c);
        
        m1.setName("Harshini");
        System.out.println("My name is :"+m1.getName());
        
	}

}



//this keyword should be used in the user defined private method