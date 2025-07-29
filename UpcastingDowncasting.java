package main;

class Machine {
	void start() {
		System.out.println("Machine started.");
	}
}

class Camera extends Machine {
	void start() {
		System.out.println("Camera started.");
	}

	void snap() {
		System.out.println("Photo clicked.");
	}
}

public class UpcastingDowncasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine machine1 = new Machine();
		Camera camera1 = new Camera();

		machine1.start();
		camera1.start();
		camera1.snap();

		// Upcasting
		Machine machine2 = camera1;
		machine2.start();

		// Downcasting
		Machine machine3 = new Camera();
		Camera camera2 = (Camera) machine3;
		camera2.start();
		camera2.snap();
	}

}
