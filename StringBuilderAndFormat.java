package main;

public class StringBuilderAndFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Inefficient
		String info = "";
		info += "My name is Mani.";
		info += " ";
		info += "I am a Builder";
		System.out.println(info);

		// String Builder
		// More efficient
		StringBuilder sb = new StringBuilder("");

		sb.append("My name is Mani.");
		sb.append(" ");
		sb.append("I am a Gamer.");
		System.out.println(sb.toString());

		StringBuilder s = new StringBuilder();
		s.append("My name is Jai.").append(" ").append("Iam a Skydiver");
		System.out.println(s.toString());

		// formatting integers

		String name = "Mani sai";
		int age = 21;
		String result = String.format("name:%s, age:%d", name, age);
		System.out.println(result);

		System.out.printf("Total cost %d; quantity is %d\n", 5, 120);

		for (int i = 0; i < 6; i++) {
			System.out.printf("%d:%s\n", i, "killer_M");
		}
		// Formatting floating points
		System.out.printf("Total value:%.2f\n", 1.2);
		System.out.printf("Total value:%-5.1f\n", 2.265);

	}

}
