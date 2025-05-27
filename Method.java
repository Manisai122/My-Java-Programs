package main;

class person2 {
	String name;
	int age;

	void speak() {
		for (int i = 0; i < 3; i++) {

			System.out.println("Hello! My name is " + name + " and I am " + age + "years old.");
		}
	}
	void sayHello() {
		System.out.println("Hello there!");
	}
}

public class Method {

	public static void main(String[] args) {
		person2 person1 = new person2();
		person1.name = "MANI";
		person1.age = 21;
		person1.speak();
		person1.sayHello();
		// System.out.println(person1.name);
		person2 person2 = new person2();
		person2.name = "JAI";
		person2.age = 9;
		person2.speak();

		// System.out.println(person2.name);
	}
}
