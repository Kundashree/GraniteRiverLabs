package OOPs_Abstraction;

public abstract class Person {

	private String name;
	private int age;
	private String address;
	
	public Person() {}
	
	//abstract methods exists in abstract class
	//abstract class can have zero or more abstract methods
	//abstract method can act like normal method too
	public abstract void doSomething(); //no body
	
	public void talk() {
		//normal method
	}
	


}
