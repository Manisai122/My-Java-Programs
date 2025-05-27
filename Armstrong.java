package main;

import java.util.*;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int number = sc.nextInt();
		System.out.println("Is armstrong number:" + isArmstrong(number));
	}

	static boolean isArmstrong(int n) {
		int digits = 0;
		int temp = n;
		while (temp > 0) {
			temp = temp / 10;
			digits++;

		}
		System.out.println("number of digits:" + digits);
		temp = n;
		int sum=0;
		while (temp > 0) {
			int lastDigit = temp % 10;
			sum = (int) (sum + Math.pow(lastDigit, digits));
			temp = temp / 10;
		}
		System.out.println("Sum is:" + sum);
		if (sum == n)
			return true;
		return false;
	}
}
