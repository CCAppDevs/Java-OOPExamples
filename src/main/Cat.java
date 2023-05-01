package main;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
		System.out.println("Cat Created with name " + getName());
	}

	public Cat(double weight, double height, double length, String name) {
		super(weight, height, length, name);
	}
	
	public void Meow() {
		System.out.println("The " + getName() + " goes meow.");
	}

	@Override
	public void MakeSound() {
		Meow();
	}

	
}
