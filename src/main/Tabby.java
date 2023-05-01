package main;

public class Tabby extends Cat {

	public Tabby(String name) {
		super(name);
		System.out.println("Tabby Created with name " + getName());
	}

	public Tabby(double weight, double height, double length, String name) {
		super(weight, height, length, name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void MakeSound() {
		super.MakeSound();
		System.out.println(getName() + " starts purring.");
	}
	
}
