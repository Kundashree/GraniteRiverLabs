package org;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<String> bookStack = new Stack();
		bookStack.push("one");
		bookStack.push("two");
		bookStack.push("three");
		bookStack.push("four");
		bookStack.push("five");
		bookStack.pop();
		bookStack.push("six");
		bookStack.pop();
		bookStack.pop();
		bookStack.push("seven");
		
		Iterator<String> itr = bookStack.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
