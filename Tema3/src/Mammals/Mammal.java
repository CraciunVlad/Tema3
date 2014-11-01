/**
 * @author KMD
 */
package Mammals;

/**
 * This is the abstract class Mammal
 * 
 * @author KMD
 * 
 * 
 */
public abstract class Mammal {
	/**
	 * @param name
	 */
	public Mammal() {
		super();
		Name = "";
	}

	/**
	 * @param name
	 */
	public Mammal(String name) {

		Name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		Name = name;
	}

	String Name;

	/**
	 * This is an abstract method for marking territory
	 */
	public abstract void markTerritory();

	/**
	 * This method implements the eating method of any mammal
	 */
	public void eat() {
		System.out.println("NumNumNum...belly full :)");
	}

}
