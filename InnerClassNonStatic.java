package main;


public class InnerClassNonStatic {
	private String message="Im outer class.";
	//Inner class
	class Inner{
		void display() {
			//can access outer class private variable
			System.out.println(message);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//First create an object of NonStaticInnerClass i.e., outer class
		InnerClassNonStatic outer=new InnerClassNonStatic();
		//Then use that to create an object of Inner
		InnerClassNonStatic.Inner inner=outer.new Inner();
		inner.display();

	}

}
