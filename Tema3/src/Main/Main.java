package Main;

import Exceptions.MyFirstException;
import Mammals.Bear;
import Mammals.Human;

/**
 * This is the main class
 * 
 * @author KMD
 * 
 */
public class Main {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {

		Human Ion = new Human("Ion");
		Bear Marin = new Bear("Marin");

		Ion.markTerritory();
		try {
			Ion.eat();
		} catch (MyFirstException e) {
			System.out.println("Exception at eat(): " + e.getMessage());
		}
		try {
			Marin.eat();
		} catch (MyFirstException e) {
			System.out.println("Exception at eat(): " + e.getMessage());
		}
		Marin.markTerritory();
		Marin.deepSleep();
		Marin.fullHibernation();

		Bear Anton = new Bear();
		try {
			Anton.eat();
		} catch (MyFirstException e) {
			System.out.println("Exception at eat(): " + e.getMessage());
		}

	}

}
