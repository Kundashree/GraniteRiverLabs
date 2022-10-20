package OOPs_Inheritance;


public class Employee extends Person{
	int empID;
	
	public Employee(String name, int age, String address, int empID)
	{
		super(name,age,address);
		this.empID = empID;
		System.out.println("Employee constructor");
	}
}
