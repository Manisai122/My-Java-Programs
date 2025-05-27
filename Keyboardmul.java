package main;

import java.util.Scanner;

public class Keyboardmul {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter 1st num:");
		int num1=input.nextInt();
		System.out.println("enter 2nd number:");
		int num2=input.nextInt();
		int mul=num1*num2;
		System.out.println("mul of numbers are:"+ mul);

	}

}
