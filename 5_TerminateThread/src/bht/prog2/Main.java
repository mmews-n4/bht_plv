package bht.prog2;

public class Main {
	public static void main(String[] args) throws Exception {
		System.out.println("Main started");
		Thread counterThread = new CounterThread();
		counterThread.start();
		counterThread.interrupt(); 
		System.out.println("Main end");
	}
}

class CounterThread extends Thread {
	@Override
	public void run() {
		System.out.println("CounterThread start");
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			System.out.println("i=" + i);
			if (interrupted()) {
				System.out.println("CounterThread interrupted");
				return;
			}
		}
		System.out.println("CounterThread end");
	}
}