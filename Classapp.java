package main;
class person{
	 String name;
	 int age; 
	 
}
public class Classapp {

	public static void main(String[] args) {
		person person1=new person();
		person1.name="MANI";
		person1.age=21;
		
		person person2=new person();
		person2.name="JAI";
		person2.age=9;
		//System.out.println(person1);
		//System.out.println(person2);
		
		System.out.println("person1 name is:" + person1.name + "\t" + "person1 age is:" + person1.age + "\n" + "person2 name is:" + person2.name + "\t" + "person2 age is:" + person2.age);

	}

}
