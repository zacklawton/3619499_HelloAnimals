package edu.pitt.is17;

/**
 * Class Fish
 * @author Zack Lawton 
 * Created 1/11/17
 */

public class Fish extends Animal {

	private String age;
	private String color;
	private String type;
	private int weight;
	private int minimumWeight;

	/**
	 * Constructor Fish
	 * @param age
	 * @param color
	 * @param type
	 * @param weight
	 * @param minimumWeight
	 */
	public Fish(String age, String color, String type, int weight, int minimumWeight) {
		super(age, color, type, weight, minimumWeight);
	}

	/**
	 * Swim method
	 * Subtract 1 off of the current weight and save
	 */
	public void swim() {
		weight = super.getWeight() - 1;
		super.setWeight(weight);
	}
}