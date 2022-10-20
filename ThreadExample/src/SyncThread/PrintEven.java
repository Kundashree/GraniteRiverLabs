package SyncThread;

public class PrintEven {

	static int i;  // amazon cart example

	public synchronized void getEven() {
		for (i = 0; i < 20; i = i + 2) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Hello");
	}
}