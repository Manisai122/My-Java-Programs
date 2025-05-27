package main;

import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = num.nextInt();
		int revnum = 0;
		int temp = number;
		while (temp != 0) {
			int reminder = temp % 10;
			revnum = revnum * 10 + reminder;
			temp /= 10;

		}
		if (number == revnum) {
			System.out.println(number + " is a Palindrome Number");
		} else {
			System.out.println(number + "  is not a Palindrome Number");
		}
	}

}
