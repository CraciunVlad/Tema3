package Mammals;

/**
 * This is the human class
 * 
 * @author KMD
 * 
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see Mammals.Mammal#markTerritory()
	 */
	public void markTerritory() {

		System.out.println("I am " + getName()
				+ " and everithing inside this fence in mine ");

	}

}
