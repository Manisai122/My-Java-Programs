package main;

import java.io.*;

public class Readkeyboard {

	public static void main(String[] args) throws IOException {
		int a, b, c;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			System.out.println("\n enter 2 numbers:");
			a = Integer.parseInt(br.readLine());
			b = Integer.parseInt(br.readLine());
			c = a + b;
			System.out.println(+c);
		} catch (NumberFormatException e) {
			System.out.println("\n Error:" + e);
		}

	}

}
