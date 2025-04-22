package Samplee.Interfaces;

class MyThread extends Thread{            //Thread class
    public void run() {
//    	System.out.println("Thread is Running...");
    	for(int i=0;i<5;i++) {
    		System.out.println("Thread is running..."+i);
    		try {
    			Thread.sleep(100);
    		}
    		catch(InterruptedException e) {
    			System.out.println("Thread is not running..."+e);
    		}
    	}
    }
}
public class Java_Threads  {              //Main Class

	public static void main(String[] args) {
        MyThread m=new MyThread();
        m.run();
        System.out.println("Thread is completed...");
	}

}












//Thread is nothing but a task