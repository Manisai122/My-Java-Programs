package main;

import java.io.*;
/*import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;*/

public class TryWithReading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FileReader=reads file from the given location or file name.
		//BufferedReader=reads the data line-by-line from the file.
		
		File file = new File("C:/Users/ADMIN/Desktop/names.txt");

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {

			// Reads the file line-by-line
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Cant find file: " + file.toString());
		} catch (IOException e) {
			System.out.println("Unable to read file: " + file.toString());
		}

	}

}
