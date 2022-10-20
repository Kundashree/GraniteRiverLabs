package SharedData;

public class SharedMe implements Runnable {
	static int i;
	public void run() {
		for(i=0;i<=5;i++) {
			System.out.println(i);
		}
	}
}
