package OOPs_Abstraction;

public class Test {

	public static void main(String[] args) {
		// person p =new Person(); not allowed, coz it is abstract class
		// Polymorphism implementation
		Person p1 = new Employee();
		p1.doSomething();
		Person p2 = new Student();
		p2.doSomething();
		Person p3 = new HouseWife();
		p3.doSomething();
		
		
		Employee e = new Employee(); 
		// pure implementation
		e.doArt();
		e.doPlay();
		e.do1();
		//Interface concept
	}

}

//An interface in Java is a blueprint of a class. It has static constants and abstract methods.
//
//The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.
//
//In other words, you can say that interfaces can have abstract methods and variables. It cannot have a method body.
