package main;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Eg:4!=4*3*2*1.(Factorial 4)
		System.out.println(factorial(4));
	}
	private static int factorial(int value) {
		//System.out.println(value);
		if(value==1) {
			return 1;
		}
		return factorial(value-1)*value;
	}
}
