package MerhodExample;

public class Calculator {
	int x;
	int y;
	
	
	//accepts nothing retrurns nothing
	public void sum1() {
		System.out.println(x+y);
	}
	
	//accepts nothing returns something
	public int sum2() {
		return x+y;
	}
	
	//accept something and returns something
	public int sum3(int a, int b) {
		return a+b;
	}
	
	
	//overloading
	//multiple methods with same name but different no of arguments, order of the args, type of args, return type of method is not considered in method overloading.


	public void sum(int a, int b) {}
	public void sum(int a, int b, int x) {}
	public void sum(int a, float b) {}
	public void sum(float a, int b) {}
}
