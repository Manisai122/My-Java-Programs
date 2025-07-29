package main;

import java.util.Objects;

class Person {
	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "person [id=" + id + ", name=" + name + "]";
	}
	//Generate Hashcode() and Equals().
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

}

public class EqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1=new Person(605,"Sankeerth");
		Person person2=new Person(605,"Sankeerth");
		
		
		//System.out.println(person1==person2); Ans:false
		System.out.println(person1.equals(person2));
		
		Double value1=7.2;
		Double value2=7.2;
		System.out.println(value1==value2);
		//System.out.println(value1.equals(value2));	Ans:true
		
		int val1=22;
		int val2=22;
		System.out.println(val1==val2);
		
		String text1="hello";
		String text2="hello".substring(0,5);
		System.out.println(text2);
		System.out.println(text1==text2);	//Ans:false
		System.out.println(text1.equals(text2));
		
	}

}
