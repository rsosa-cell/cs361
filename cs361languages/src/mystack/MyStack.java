/**
 * 
 */
package mystack;

/**
 * @author Raphael  
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	/**
	 * @return
	 */
	public T pop() {
		// TODO To complete
		if (theStack == null) {
		throw new IllegalStateException("The Stack is empty.");
		}
		T value = theStack.val;
		theStack = theStack.next;
		return null;
	}

	public void push(T v) {
		// TODO To complete
		MyNode<T> newNode = new MyNode<>(v, theStack);
		theStack = newNode;
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		MyStack<Integer> intStack = new MyStack<>();

		// Push 1 and 2
		intStack.push(1);
		intStack.push(2);

		// Pop
		System.out.println("Popped: " + intStack.pop());

		// Push 5
		intStack.push(5);
		
		// TODO To complete
		// Create a stack of Person
		MyStack<Person> personStack = new MyStack<>();
 
		// Push a person p1 with your name
		Person p1 = new Person("Raphael Sosa"); 
		personStack.push(p1);

		// Push a person p2 with my name
		Person p2 = new Person("Chareff");
		personStack.push(p2);
	}
}


 class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

