package main;

class Machine4 {
	public void start() {
		System.out.println("Starting machine....");
	}
}

interface Plant {
	public void grow();
}

public class AnonymousClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating anonymous classes
		Machine4 machineA = new Machine4() {
			@Override
			public void start() {
				System.out.println("Camera snapping....");
			}
		};
		machineA.start();

		/*Plant plant1 = new Plant() {
			@Override
			public void grow() {
				// TODO Auto-generated method stub
				System.out.println("Plant growing.");
			}

		};*/
		//Rewriting anonymous class with lambda		(Lambda expressions only work with functional interfaces)
		Plant plant1= () -> System.out.println("Plant growing.");
		plant1.grow();
		
	}

}
