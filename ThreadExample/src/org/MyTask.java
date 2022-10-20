package org;

public class MyTask implements Runnable {
	public void run()
	{
		for(int x = 0;x<5;x++)
		{
			System.out.println(x);
		}
	}
}
