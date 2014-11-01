/**
 * 
 */
package Mammals;

import Interfaces.Hibernate;

/**
 * This is the Bear class that extends Mammal and implements the Hibernate
 * interface
 * 
 * @author KMD
 * 
 */
public class Bear extends Mammal implements Hibernate {

	/**
	 * 
	 */
	public Bear() {
		super();

	}

	/**
	 * @param name
	 */
	public Bear(String name) {
		super(name);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Interfaces.Hibernate#deepSleep()
	 */
	public void deepSleep() {
		System.out
				.println("I "
						+ getName()
						+ " will sleep for a few hours...MoMorMor...or until i hear something");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Interfaces.Hibernate#fullHibernation()
	 */
	public void fullHibernation() {
		System.out.println("MorMorMor...until the winter passes");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Mammals.Mammal#markTerritory()
	 */
	public void markTerritory() {
		System.out
				.println("I mark with leaves and branches and in some other ways..");

	}

}
