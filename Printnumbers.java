package main;

public class Printnumbers {

	public static void main(String[] args) {
		int i;
		for (i = 0; i <= 1000; i++) {

			if (i % 50 == 0)
				System.out.println("\t" + i);
		}
	}

}
