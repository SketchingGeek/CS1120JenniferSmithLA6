/* Assignment: CS1120 LA6 Binary Files and Data Structures
 * Author: Jennifer N. Smith
 * Date: 4/4/18
 * Reference: LA6_Spring2018.docx (LA6 Instructions)
 */

import java.util.Stack;

/**
 * A minimum value stack stores elements in order of size: the smallest element
 * is stored at the top of the stack (and so will be the first to be popped off
 * the stack) while the largest element will be the last to be popped off the
 * stack.
 */
public class MinValueStack<T extends Comparable<T>> {

	private Stack<T> stack1;
	private Stack<T> stack2;
	private int size;

	/**
	 * A no-arg constructor to initialize class members.
	 */
	
	public MinValueStack() {
		stack1 = new Stack<T>();
		stack2 = new Stack<T>();
		size = 0;
	}

	/**
	 * Method to push data onto the stack. This method specifically keeps the
	 * stack in ascending order: the smallest (minimum value) is stored at the
	 * top of the stack so it is the next element to be popped off the stack.
	 * 
	 * @param data
	 *            The data (element) to be added to the stack.
	 * @return The data added to the stack
	 */
	
	public T push(T data) {

		while ( stack1.size() != 0 && data.compareTo (stack1.peek()) > 0) {

			T top = stack1.pop();

			stack2.push(top);

		}

		stack1.push(data);

		while (stack2.size() != 0) {
			T top = stack2.pop();
			stack1.push(top);

		}

		++size;
		return data;

	}

//	/**
//	 * Print the stack for debug
//	 */
//	
//	void print() {
//		while (stack1.size() != 0 ) {
//			T top = stack1.pop();
//			System.out.print(top + " " );
//			stack2.push(top);
//			
//		}
//		while (stack2.size() != 0 ) {
//			T top = stack2.pop();
//			stack1.push(top);
//			
//		}
//		System.out.println();
//		
//	}
	
	/**
	 * Method to return the minimum value on the stack, but not remove it.
	 * 
	 * @return The minimum value stored in the stack.
	 */
	
	public T minValue() {
		if (stack1.isEmpty()) {
			return null;
		}

		T top = stack1.pop();
		stack1.push(top);

		return top;
	}

	/**
	 * Method to pop the minimum value off the stack
	 * 
	 * @return The popped data.
	 */

	public T pop() {
		--size;

		return stack1.pop();
	}

	/**
	 * Method to return if the stack is empty or not.
	 * 
	 * @return true if stack is empty, else false.
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * Return the size of the stack (number of elements stored in it)
	 * 
	 * @return The size of the stack
	 */
	public int getSize() {
		return size;
	}

}
