/**
 * 
 */
package exceptions;

import java.io.FileNotFoundException;

//import java.io.IOException;

/**
 * This is MySecondException Class that extends the FileNotFoundException class
 * 
 * @author KMD
 */
public class MySecondException extends FileNotFoundException {
	private String message = null;

	/**
	 * Constructor for MySecondException No parameters
	 */
	public MySecondException() {
		super();
	}

	/**
	 * Constructor for MySecondException
	 * 
	 * @param msg
	 */
	public MySecondException(String msg) {
		super(msg);
		this.message = msg;
	}

	/**
	 * getMessage method overridden
	 * 
	 * @see java.lang.Throwable#getMessage()
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * toString method overridden
	 * 
	 * @see java.lang.Throwable#toString()
	 */
	public String toString() {
		return message;
		
	}

}
