package org;

public class Test {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());
		MyThread t1 = new MyThread();
		t1.start(); //in turn calls run method

		MyThread t2 = new MyThread();
		t2.start();

		MyThread t3 = new MyThread();
		t3.start();
			
		System.out.println("--------------------");
		
		MyTask obj = new MyTask();
		Thread t4 = new Thread(obj);
		t4.start();
	}

}
