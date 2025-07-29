package main;

public class PassValPerson {
	private String name;

	public PassValPerson(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "PassValPerson [name=" + name + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}
