package Mammals;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import Exceptions.MySecondException;

/**
 * This is the human class
 * 
 * @author KMD
 */
public class Human extends Mammal {

	/**
	 * Constructor for the Human Class whit no parameters
	 */
	public Human() {
		super();
	}

	/**
	 * Constructor for the Human Class whit parameters
	 * 
	 * @param name
	 */
	public Human(String name) {
		super(name);
	}

	/**
	 * The markTherritory methode
	 * 
	 * @see Mammals.Mammal#markTerritory()
	 */
	public void markTerritory() {

		System.out.println("I am " + getName()
				+ " and everithing inside this fence in mine ");
	}

	/**
	 * This method implements reading from a file for the Human class
	 * 
	 * @param filename
	 * @throws MySecondException
	 */
	public void read(String filename) throws MySecondException {
		String content;
		if (filename == null)
			throw new MySecondException("The file name provided is null");

		File file = new File(filename);

		try {
			FileReader reader = new FileReader(file);

			char[] chars = new char[(int) file.length()];
			reader.read(chars);
			content = new String(chars);
			reader.close();
		} catch (IOException e) {
			System.out
					.println("There was an error in the read() method of class Human :"
							+ e.getMessage() + " " + e.getCause());

		}
	}
}
