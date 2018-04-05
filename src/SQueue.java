/* Assignment: CS1120 LA6 Binary Files and Data Structures
 * Author: Jennifer N. Smith
 * Date: 4/4/18
 * Reference: LA6_Spring2018.docx (LA6 Instructions)
 */

import java.util.Stack;

/**
 * A version of a queue implemented with two stacks
 * 
 * @param <T>
 *            Type parameter for Generic class SQueue
 */

public class SQueue<T> {
	private Stack<T> stack1;
	private Stack<T> stack2;
	private int size;

	/**
	 * No-arg constructor to initialize members
	 */
	
	public SQueue() {
		stack1 = new Stack<T>();
		stack2 = new Stack<T>();
		size = 0;
	}

	/**
	 * Add data to the queue.
	 * 
	 * @param data
	 *            The data to add to the queue.
	 * @return The data added to the queue (for simpler print statements)
	 */
	
	public T enqueue(T data) {
		
		stack1.push(data);
		++size;

		return data;

	}

	/**
	 * Remove the next item from the front of the queue.
	 * 
	 * @return The data in the front of the queue
	 */
	
	public T dequeue() {
		
		for (int i = 0; i < size; i++) {
			T top = stack1.pop();
			stack2.push(top);
			
		}
		
		T topReturn = stack2.pop();
		--size;
		
		for (int i = 0 ; i < size ; i++) {
			T top = stack2.pop();
			stack1.push(top);
			
		}
		
		return topReturn;
	}

	/**
	 * Return the size of the queue (number of elements stored in it)
	 * 
	 * @return The size of the queue
	 */
	
	public int getSize() {
		return size;
	}
}
