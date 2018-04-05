/* Assignment: CS1120 LA6 Binary Files and Data Structures
 * Author: Jennifer N. Smith
 * Date: 4/4/18
 * Reference: LA6_Spring2018.docx (LA6 Instructions)
 */

import java.util.LinkedList;
import java.util.Queue;

/**
 * Implementing a stack using 2 queues
 * @author Jennifer Smith
 *
 * @param <T>
 */

public class QStack<T> {
	private Queue<T> queue1;
	private Queue<T> queue2;
	private int size;

	/**
	 * No-arg constructor to initialize members
	 */
	
	public QStack() {
		queue1 = new LinkedList<T>();
		queue2 = new LinkedList<T>();
		size = 0;
	}

	/**
	 * Add data to the stack.
	 * 
	 * @param data   The data to add to the stack.
	 * @return The data added to the stack (for simpler print statements)
	 */
	
	public T push (T data) {
		queue1.add(data);
		++size;
		return data;

	}

	/**
	 * Pop data off the top of the stack
	 * 
	 * @return The popped data
	 */
	
	public T pop() {
		for (int i = 0 ; i < size-1 ; i ++) {
			T begin = queue1.remove();
			queue2.add(begin);
			
		}
		
		T beginReturn = queue1.remove();
		--size;
		
		queue1 = queue2;
		queue2 = new LinkedList<T>();
		
		return beginReturn;

	}

    /**
     * Return the size of the stack (number of elements stored in it)
     * @return  The size of the stack
     */
	
    public int getSize() {
    	return size;
    }
}
