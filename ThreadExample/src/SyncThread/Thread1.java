package SyncThread;

public class Thread1 extends Thread {

	PrintEven obj;

	public Thread1(PrintEven obj) {
		super();
		this.obj = obj;
	}

public void run() {
obj.getEven();
}
}