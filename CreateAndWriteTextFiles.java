package main;

import java.io.*;
/*import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;*/

public class CreateAndWriteTextFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:/Users/ADMIN/Desktop/names.txt");

		try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
			br.write("This is line one.");
			br.newLine();
			br.write("This is line two.");
			br.newLine();
			br.write("This is line three.");
			

		
		} catch (IOException e) {
			System.out.println("Unable to read file: " + file.toString());
		}

	}
	}


