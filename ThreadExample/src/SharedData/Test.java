package SharedData;

public class Test {

	public static void main(String[] args) {
		SharedMe obj1 = new SharedMe();
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj1);
		Thread t3 = new Thread(obj1);
		t1.start();
		t2.start();
		t3.start();
	}

}
