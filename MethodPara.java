package main;
class Robot{
	public void speak(String text) {
		System.out.println(text);
	}
	public void jump(int height) {
		System.out.println("jumping:"+height);
	}
	public void move(double distance,String direction) {
		System.out.println("moving " +distance + " in a direction of " +direction);
	}
}
public class MethodPara {

	public static void main(String[] args) {
		Robot sam=new Robot();
		
		sam.speak("Hi! I am sam.");
		sam.jump(7);
		sam.move(12.2, "west");
		int value=6;
		sam.jump(value);
	}

}
