/* Assignment: CS1120 LA6 Binary Files and Data Structures
 * Author: Jennifer N. Smith
 * Date: 4/4/18
 * Reference: LA6_Spring2018.docx (LA6 Instructions)
 */


import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Reads the numbers from the file
 * 
 * @author Jennifer Smith
 *
 */

public class Read {

	private ArrayList<Short> store;

	/**
	 * Store the parameter in the member data
	 * 
	 * @param store
	 */

	public Read(ArrayList<Short> store) {

		this.store = store;
	}

	/**
	 * read the data and save them into an ArrayList.
	 * 
	 * @param filename
	 */

	public void readFileInputStream(String filename) {
		try (InputStream inputStream = new FileInputStream(filename);) {

			DataInputStream is = new DataInputStream(
					new BufferedInputStream(inputStream));

			// INCLUDE CODE TO ADD THE ELEMENTS READ FROM THE INPUT FILE TO THE
			// ARRAYLIST “store”.

			for (int i = 0; i < 20; i++) {
				short num = is.readShort();
				store.add(num);

			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Return the member data
	 * 
	 * @return member data
	 */

	public ArrayList<Short> getStore() {
		return store;
	}
}
