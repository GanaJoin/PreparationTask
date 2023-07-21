package oopsConcepts;

public class MyThreadImp implements Runnable {
	public void run() {
		synchronized(MyThreadImp.class) {
		System.out.println("Hello");
		
		try {
			MyThreadImp.class.wait(5000);
			System.out.println("Thread is waiting");
		}
		catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
	}
	
	public static void main(String[] args)  throws InterruptedException {
		MyThreadImp b= new MyThreadImp();
		Thread t= new Thread(b);
		t.start();
		Thread .sleep(2000);
		System.out.println("hi");
	}

}
