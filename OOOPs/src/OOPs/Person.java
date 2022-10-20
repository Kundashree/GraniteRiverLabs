package OOPs;

//encapsulation
//binding the data with code
//keep the class as private as possible


//attributes are private but other classes can access through public getter and setter

public class Person {

	private String name;
	private int age;
	private String address;
	
	public Person() {} // -> constructor
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	

}
