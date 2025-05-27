package main;

class Candidate {
    String name;
    int age;

    // Default constructor
    public Candidate() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Constructor with one parameter
    public Candidate(String name) {
        this.name = name;
        this.age = 0;
    }

    // Constructor with two parameters
    public Candidate(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Method to display student details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorOverload {

    public static void main(String[] args) {
        // Using default constructor
    	Candidate s1 = new Candidate();
        s1.display();

        // Using constructor with one parameter
        Candidate s2 = new Candidate("Jayansh");
        s2.display();

        // Using constructor with two parameters
        Candidate s3 = new Candidate("Mani sai", 21);
        s3.display();
    }
}