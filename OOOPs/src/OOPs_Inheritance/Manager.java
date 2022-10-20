package OOPs_Inheritance;

public class Manager extends Employee {
	String dept;
	
	public Manager(String name, int age, String address, int empID, String dept)
	{
		//super() hidden if no arguments
		super(name,age,address,empID);
		this.dept = dept;
		System.out.println("Manager constructor");
	}
}
