package main;

public class PassbyValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassbyValue app=new PassbyValue();	
		
		//======================================
		int value=7;
		System.out.println("1.Value is: "+value);

		app.show(value);
		System.out.println("4.Value is: "+value);
		//=======================================
		System.out.println();
		
		PassValPerson person=new PassValPerson("Mani");
		System.out.println("1.Person is: "+person);
		
		app.show(person);
		System.out.println("4.Person is: "+person);

		
	}
	public void show(int value) {
		System.out.println("2.Value is: "+value);
		value=8;
		System.out.println("3.Value is: "+value);

	}
	public void show(PassValPerson person) {
		System.out.println("2.Person is: "+person);
		person=new PassValPerson("Jaggu");
		System.out.println("3.Person is: "+person);

	}
}
