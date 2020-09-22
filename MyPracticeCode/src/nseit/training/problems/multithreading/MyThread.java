package nseit.training.problems.multithreading;

public class MyThread extends Thread{
	
	public void run() {
		System.out.println("Thread Begin....");
		for(int i= 1; i<=50; i++) {
			System.out.println(i);
		}
		System.out.println("Thread Stopped!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t = new MyThread();
		t.start();
		
		System.out.println("Main Thread Begin....");
		for(int i= 1; i<=100; i++) {
			System.out.println(i);
		}
		System.out.println("Main Thread Stopped!");
		
		
		
	}

}
