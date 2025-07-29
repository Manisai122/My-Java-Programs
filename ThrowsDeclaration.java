package main;

import java.io.IOException;

class A {
	public static void readCharacter() throws IOException {
		char ch;
		System.out.println("Enter character: ");
		ch = (char) System.in.read();
		// throws IOException
		System.out.println("ch:" + ch);
	}
}

public class ThrowsDeclaration {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		A.readCharacter();

	}

}
