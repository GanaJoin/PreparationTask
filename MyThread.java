package oopsConcepts;

public class MyThread extends Thread {
	
	public void run() {
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
		System.out.println("Hi");
		MyThread s= new MyThread();
		s.start();
		
	}

}
