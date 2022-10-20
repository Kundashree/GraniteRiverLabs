package OOPs_Abstraction;

public class Employee extends Person implements Artist, Player {
	public void doSomething() {
		System.out.println("An employee works to make his living");
	}
	
	
	// Interface
	// a child cannot have multiple parents. 
	// from interface it can take features from different places
	// interface can also inherit from parent interface
	public void doArt() {
		System.out.println("employee can be artist");
	}
	
	public void doPlay() {
		System.out.println("employee can be player");
	}
	public void do1() {
		System.out.println("artist is the child class of Doable");
	}
}
