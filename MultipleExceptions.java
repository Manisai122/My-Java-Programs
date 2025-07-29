package main;

import java.util.Scanner;

public class MultipleExceptions {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		try {
			System.out.println("Enter a:");
			a=Integer.parseInt(sc.nextLine());
			System.out.println("Enter b:");
			b=Integer.parseInt(sc.nextLine());
			c=a/b;
			System.out.println("div:"+c);
		}
		catch(ArithmeticException e1) {
			System.out.println("Error1:"+e1);
			//e1.printStackTrace();
		}
		catch(NumberFormatException e2) {
			System.out.println("Error2 is:"+e2);
			//e2.printStackTrace();
		}
		System.out.println("Program terminating.....");
		
		
	}
}
