package main;

class Thing {
	public final static int LUCKY_NUMBER = 122;

	public String name;
	public static String description;

	public static int count = 0;
	public int id;

	public Thing() {
		id = count;
		count++;

	}

	public void showName() {
		System.out.println("Object id :" + id + "," + description + ":" + name);
	}

	public static void showInfo() {
		System.out.println(description);
		// wont work : System.out.println(name);
	}
}

public class StaticVarAndMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thing.description = "I am a thing.";
		Thing.showInfo();

		System.out.println("Before creating of objects,count is:" + Thing.count);
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		System.out.println("After creating of objects,count is:" + Thing.count);
		thing1.name = "Mani";
		thing2.name = "Jai";

		thing1.showName();
		thing2.showName();

		System.out.println(Math.PI);

		System.out.println(Thing.LUCKY_NUMBER);

	}

}
