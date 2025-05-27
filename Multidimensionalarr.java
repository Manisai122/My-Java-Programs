package main;

public class Multidimensionalarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = { 1, 2, 3 };
		System.out.println(values[2]);

		int[][] array = { { 2, 3, 4 }, { 5, 6, 7 }, { 1, 3, 6, 7, 8 } };
		System.out.println(array[2][0]);
		System.out.println(array[1][1]);

		String[][] texts = new String[2][3];
		texts[0][2] = "Hello Mani!";
		System.out.println(texts[0][2]);

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
