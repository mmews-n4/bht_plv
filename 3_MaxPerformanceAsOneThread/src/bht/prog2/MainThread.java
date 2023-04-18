package bht.prog2;

public class MainThread {
	public static void main(String[] args) {
		System.out.println("Main started");
		Thread counterThread = new CounterThread();
		counterThread.start();
		System.out.println("Main end");
	}
}

class CounterThread extends Thread {
	public CounterThread() {
		super("CounterThread");
	}

	@Override
	public void run() {
		System.out.println("CounterThread start");
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			System.out.println("i=" + i);
		}
		System.out.println("CounterThread end");
	}
}