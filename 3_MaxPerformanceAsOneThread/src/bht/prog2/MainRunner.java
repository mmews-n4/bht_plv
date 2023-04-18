package bht.prog2;

public class MainRunner {
	public static void main(String[] args) {
		System.out.println("Main started");
		CounterRunner counterRunner = new CounterRunner();
		Thread counterThread = new Thread(counterRunner);
		counterThread.start();
		System.out.println("Main end");
	}
}

class CounterRunner implements Runnable {
	@Override
	public void run() {
		System.out.println("CounterRunner start");
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			System.out.println("i=" + i);
		}
		System.out.println("CounterRunner end");
	}
}
