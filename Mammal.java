package edu.pitt.is17;

/**
 * Class Mammal
 * @author Zack Lawton 
 * Created 1/11/17
 */

public class Mammal extends Animal {

	private String age;
	private String color;
	private String type;
	private int weight;
	private int minimumWeight;

	/**
	 * Constructor Mammal
	 * 
	 * @param age
	 * @param color
	 * @param type
	 * @param weight
	 * @param minimumWeight
	 */
	public Mammal(String age, String color, String type, int weight, int minimumWeight) {
		super(age, color, type, weight, minimumWeight);
	}

	/**
	 * Run Method
	 * Subtract 1 off of the current weight and save
	 */
	public void run() {
		weight = super.getWeight() - 1;
		if(weight == super.getMinimumWeight()){
			System.out.println("Weight has reached Minimum Weight");
			super.setWeight(weight);
		}
		else{
			super.setWeight(weight);
		}

	}

}
