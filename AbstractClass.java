package main;

abstract class Animal {
	// abstract method
	abstract void makeSound();

	// concrete method(with body)
	public void sleep() {
		System.out.println("The animal is sleeping.");
	}
}

class Dog extends Animal {
	void makeSound() {
		System.out.println("Dog is barking.");
	}
}

class Cat extends Animal {
	void makeSound() {
		System.out.println("Meow Meow.......");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Cannot create object for abstract class
		// Animal animal=new Animal();

		// create objects for subclass
		Dog dog = new Dog();
		Cat cat = new Cat();

		dog.makeSound();
		dog.sleep();
		cat.makeSound();
		cat.sleep();

	}

}
