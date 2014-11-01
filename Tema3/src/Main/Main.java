package Main;

import Exceptions.MyFirstException;
import Mammals.Bear;
import Mammals.Human;

/**
 * This is the main class
 * @author KMD
 * 
 */
public class Main {

	/**
	 * @param args
	 * @throws MyFirstException 
	 */
	public static void main(String[] args) throws MyFirstException {

		Human Ion = new Human("Ion");
		Bear Marin = new Bear("Marin");

		Ion.markTerritory();
		Ion.eat();

		Marin.eat();
		Marin.markTerritory();
		Marin.deepSleep();
		Marin.fullHibernation();
		
		Bear Anton=new Bear();
		Anton.eat();
		

	}

}
