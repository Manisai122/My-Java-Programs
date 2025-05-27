package main;

class Student {
	String name;
	int age;

	void speak() {
		System.out.println("My name is:" + name);
	}

	int calculateYearsToRetirement() {
		int yearsLeft = 65 - age;
		return yearsLeft;
	}
	int getAge() {
		return age;
	}
	String getName() {
		return name;
	}
}

public class GettersReturn {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.name = "Mani";
		student1.age = 21;
		// System.out.println(student1.name);
		//student1.speak();
		int years = student1.calculateYearsToRetirement();
		System.out.println("Years till retirement:" + years);
		int age=student1.getAge();
		String name=student1.getName();
		System.out.println("Name is: "+name);
		System.out.println("Age is: " + age);

	}

}
