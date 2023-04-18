package bht.prog2;

public class Main {
	static int ERGEBNIS = 0;

	public static void main(String[] args) throws Exception {
		System.out.println("start");

		PlusOneThread threadA = new PlusOneThread("A");
		PlusOneThread threadB = new PlusOneThread("B");
		threadA.start();
		threadB.start();

		System.out.println("end");
	}

	static class PlusOneThread extends Thread {
		PlusOneThread(String name) {
			super(name);
		}

		@Override
		public void run() {
			ERGEBNIS++;
			System.out.println(getName() + ": " + ERGEBNIS);
		}
	}
}