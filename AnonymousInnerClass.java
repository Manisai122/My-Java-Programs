package main;

abstract class Animal1{
	abstract void makeSound();
}
public class AnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal1 dog=new Animal1() {
			void makeSound() {
				System.out.println("BOW BOW");
			}
		};
		dog.makeSound();
	}

}
