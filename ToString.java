package main;

class person1 {
	String name;
	int age;

	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + "]";
	}

}

public class ToString {

	public static void main(String[] args) {
		person1 person1 = new person1();
		person1.name = "MANI";
		person1.age = 21;

		person1 person2 = new person1();
		person2.name = "JAI";
		person2.age = 9;
		System.out.println(person1);
		System.out.println(person2);

		// System.out.println("person1 name is:" + person1.name + "\t" + "person1 age
		// is:" + person1.age + "\n" + "person2 name is:" + person2.name + "\t" +
		// "person2 age is:" + person2.age);

	}

}
