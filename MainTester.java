package edu.pitt.is17;

import java.util.Vector;

/**
 * Class MainTester
 * @author Zack Lawton 
 * Created 1/11/17
 */

public class MainTester {

	public static void main(String[] args) {

		Mammal cat = new Mammal("18", "orange", "Cat", 20, 10);
		Fish goldfish = new Fish("15", "gold", "Goldfish", 12, 10);
		Bird robin = new Bird("10", "blue", "Robin", 10, 5);
		Mammal hamster = new Mammal("9", "blonde", "Hamster", 6, 3);

		Vector<Animal> save = new Vector<Animal>();

		// Save Objects to Vector
		save.add(cat);
		save.add(goldfish);
		save.add(hamster);
		save.add(robin);

		/**
		 * Iterate through vector to allow each object to eat and move
		 */
		for (int i = 0; i < save.size(); i++) {
			// Print Initial Weight
			System.out.println(save.get(i).toString() + " Initial Weight: " + save.get(i).getWeight());

			// Allow Object to Eat
			save.get(i).eat();

			// Print weight after eating
			System.out.println(save.get(i).toString() + " Just Ate: " + save.get(i).getWeight());

			// Determine object type of vector position, make the object move
			// and save the new weight
			if (save.get(i) instanceof Mammal) {
				Mammal m = (Mammal) save.get(i);
				m.run();
				save.set(i, m);
				m.output();
			} else if (save.get(i) instanceof Bird) {
				Bird b = (Bird) save.get(i);
				b.fly();
				save.set(i, b);
				b.output();
			} else if (save.get(i) instanceof Fish) {
				Fish f = (Fish) save.get(i);
				f.swim();
				save.set(i, f);
				f.output();
			}
		}

	}

}
