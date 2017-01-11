package edu.pitt.is17;

import java.util.Iterator;
import java.util.Vector;

/**
 * Class Animal
 * @author Zack Lawton 
 * Created 1/11/17
 */

public class Animal {

	private String age;
	private String color;
	private String type;
	private int weight;
	private int minimumWeight;

	/**
	 * Constructor Animal
	 * @param age
	 * @param color
	 * @param type
	 * @param weight
	 * @param minimumWeight
	 */
	public Animal(String age, String color, String type, int weight, int minimumWeight) {
		this.age = age;
		this.color = color;
		this.type = type;
		this.weight = weight;
		this.minimumWeight = minimumWeight;
	}

	/**
	 * Eat Method
	 * Increase weight by 1
	 */
	public void eat() {
		this.weight++;
	}

	/**
	 * Output Method
	 * Print the object type and final weight
	 */
	public void output() {
		System.out.println(type + " Final Weight: " + weight);
	}

	/**
	 * Getters and Setters
	 */

	public int getWeight() {
		return this.weight;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getMinimumWeight() {
		return minimumWeight;
	}

	public void setMinimumWeight(int minimumWeight) {
		this.minimumWeight = minimumWeight;
	}

	public void setWeight(int weight) {
		this.weight = weight;

	}

	@Override
	public String toString() {
		return getType();
	}

}
