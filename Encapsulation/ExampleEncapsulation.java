package javasample;

class Demo{
    private static String sname;

    public static String getName() { // Made static
        return sname;
    }

    public static void setName(String name) {
        sname = name; // Assigning value to the static variable
    }
}

public class ExampleEncapsulation {
    private static int sid = 101;

    public static void main(String[] args) {
        System.out.println("sid is: " + sid);

        Demo.setName("Harshini"); // Static method call
        System.out.println("sname is: " + Demo.getName()); // Static method call
    }
}
