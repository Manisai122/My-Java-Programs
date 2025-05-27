package main;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter some command:");
		String text = input.nextLine();
		switch (text) {
		case "start":
			System.out.println("Machine started.");
			break;

		default:
			System.out.println("Command not found");
		}
	}

}
