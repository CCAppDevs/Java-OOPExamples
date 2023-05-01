package main;

public class Animal {
	private double Weight;
	private double Height;
	private double Length;
	private String Name;
	
	// constructors
	public Animal(String name) {
		Name = name;
		System.out.println("Animal Created with name " + Name);
	}

	public Animal(double weight, double height, double length, String name) {
		Weight = weight;
		Height = height;
		Length = length;
		Name = name;
	}



	public void Eat() {
		System.out.println(Name + " is eating.");
	}
	
	public void MakeSound() {
		System.out.println(Name + " makes a sound.");
	}
	
	
	
	// getters and setters

	public double getWeight() {
		return Weight;
	}

	public void setWeight(double weight) {
		Weight = weight;
	}

	public double getHeight() {
		return Height;
	}

	public void setHeight(double height) {
		Height = height;
	}

	public double getLength() {
		return Length;
	}

	public void setLength(double length) {
		Length = length;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}


	
	
}
