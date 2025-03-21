package Samplee.Interfaces;

interface Employee{
	abstract void job();
}
class emp_id implements Employee{
	public void job() {
		System.out.println("Employee_id :101");
	}
}

class emp_name implements Employee{
	public void job() {
		System.out.println("Employee_name:Harshini");
	}
}
class emp_sal implements Employee{
	public void job() {
		System.out.println("Employee_salary:30000");
	}
}
class emp_loc implements Employee{
	public void job() {
		System.out.println("Employee_location:Bangalore");
	}
}
class emp_phno implements Employee{
	public void job() {
		System.out.println("Employee_phonenumber:1234567890");
	}
}
public class Main1 {

	public static void main(String[] args) {
		System.out.println("** Employee_Details **");
		System.out.println("---------------------");
     emp_id e1=new emp_id();
     e1.job();
     emp_name e2=new emp_name();
     e2.job();
     emp_sal e3=new emp_sal();
     e3.job();
     emp_loc e4=new emp_loc();
     e4.job();
     emp_phno e5=new emp_phno();
     e5.job();

	}

}
