package edu.pitt.is17;

/**
 * Class Bird
 * @author Zack Lawton 
 * Created 1/11/17
 */

public class Bird extends Animal {

	private String age;
	private String color;
	private String type;
	private int weight;
	private int minimumWeight;

	/**
	 * Constructor Bird
	 * @param age
	 * @param color
	 * @param type
	 * @param weight
	 * @param minimumWeight
	 */
	public Bird(String age, String color, String type, int weight, int minimumWeight) {
		super(age, color, type, weight, minimumWeight);
	}

	/**
	 *  Fly Method
	 *  Subtract 2 off of the current weight and save
	 */
	public void fly() {
		weight = super.getWeight() - 2;
		super.setWeight(weight);
	}

}
