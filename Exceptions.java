package main;

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] texts= {"one","two","three"};
		try {
		System.out.println(texts[3]);
	}
		catch(Exception e) {
			System.out.println(e.toString());
			
		}
	}
}
