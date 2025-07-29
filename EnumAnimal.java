package main;

public enum EnumAnimal {
	DOG("Kaala"), CAT("Leo"), MOUSE("Jerry");

	private String name;

	EnumAnimal(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "This animal name is: " + name;

	}

}
