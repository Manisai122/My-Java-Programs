package main;

public class StaticNestedClass {
	static int data=30;
	//static nested class
	static class Nested{
		void show() {
			System.out.println("Data is: "+data);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Directly create object of static nested class
		StaticNestedClass .Nested nested=new StaticNestedClass.Nested();
		nested.show();
	}

}
