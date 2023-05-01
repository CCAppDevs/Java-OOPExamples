package main;

public class Program {

	public static void main(String[] args) {
		Animal myAnimal = new Animal("Duck");
		Animal myCat = new Cat(10.2, 10.3, 10.4, "Cat");
		Animal myTabby = new Tabby("Taz");
		Animal moose = new Dog("Moose");
		
		// list of animals
		Animal[] myAnimals = { myAnimal, myCat, myTabby, moose };
		
		for (int i = 0; i < myAnimals.length; i++) {
			myAnimals[i].MakeSound();
		}
		
//		myAnimal.MakeSound();
//		myCat.MakeSound();
		
		System.out.println("Cat has a weight of: " + myCat.getWeight());
		System.out.println("Duck has a weight of: " + myAnimal.getWeight());
	}

}
