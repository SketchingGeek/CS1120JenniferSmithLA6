/* Assignment: CS1120 LA6 Binary Files and Data Structures
 * Author: Jennifer N. Smith
 * Date: 4/4/18
 * Reference: LA6_Spring2018.docx (LA6 Instructions)
 */



import java.io.IOException;
import java.util.ArrayList;

/**
 * Class containing the main. Tests queues and stacks.
 * 
 * @author Jennifer Smith
 *
 */

public class MainActivity {

	/**
	 * Main method test queues and stacks
	 * 
	 * @param args not used
	 * @throws IOException 
	 */

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ArrayList<Short> store = new ArrayList<>();
		Read read = new Read(store);

		QStack<Short> stack = new QStack<>();
		SQueue<Short> queue = new SQueue<>();
		MinValueStack<Short> mVStack = new MinValueStack<>();

		read.readFileInputStream("TestData.dat");

		System.out.println("The values pushed onto the stack are:");

		// INCLUDE CODE TO STORE ALL ELEMENTS FROM THE ARRAYLIST IN BOTH “stack”
		// AND “mVStack”

		ArrayList<Short> nums = read.getStore();

		for (int i = 0; i < nums.size(); i++) {
			Short oneNum = nums.get(i);
			System.out.print(oneNum + " ");
			stack.push(oneNum);
			mVStack.push(oneNum);
		}
		// System.out.println();
		System.out.println("\n\nThe values popped off the stack in order are:");
		// INCLUDE CODE TO REMOVE AND DISPLAY ALL ELEMENTS STORED IN “stack”.

		while (stack.getSize() != 0) {
			Short oneNum = stack.pop();
			System.out.print(oneNum + " ");
		}

		System.out
				.println("\n\nThe min value (from the minimum value stack) is:"
						+ mVStack.minValue());

		System.out.println(
				"\nThe values popped off the minimum value stack in order are:");
		// INCLUDE CODE TO REMOVE AND DISPLAY ALL ELEMENTS STORED IN “mVStack”.
		while (mVStack.getSize() != 0) {
			Short oneNum = mVStack.pop();
			System.out.print(oneNum + " ");
		}
		System.out.println("\n\nThe values enqueued onto the queue are:");
		// INCLUDE CODE TO DISPLAY AND STORE ALL ELEMENTS FROM THE ARRAYLIST IN
		// “queue”.

		for (int i = 0; i < nums.size(); i++) {
			queue.enqueue(nums.get(i));
			System.out.print(nums.get(i) + " ");
		}

		System.out.println(
				"\n\nThe values dequeued from the queue in order are:");
		// INCLUDE CODE TO REMOVE AND DISPLAY ALL ELEMENTS STORED IN “queue”.

		while (queue.getSize() != 0) {
			Short num = queue.dequeue();
			System.out.print(num + " ");

		}
		System.out.println();
	}
}
