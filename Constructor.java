package main;
class Human{
	private String name;
	private int age;
	
	public Human(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
}
public class Constructor {

	public static void main(String[] args) {
		Human human1=new Human("mani sai",21);
		
		System.out.println(human1.getName()+" : "+human1.getAge());	
		

	}

}
