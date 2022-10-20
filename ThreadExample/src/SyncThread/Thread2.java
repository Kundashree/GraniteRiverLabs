package SyncThread;

public class Thread2 extends Thread {
	PrintEven obj;

	public Thread2(PrintEven obj) {
		super();
		this.obj = obj;
	}

public void run() {
obj.getEven();
}
}