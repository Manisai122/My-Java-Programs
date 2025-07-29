package main;

import java.io.*;
//import java.io.FileReader;

public class ReadingFilesWithFileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FileReader=reads file from the given location or file name.
		//BufferedReader=reads the data line-by-line from the file.

		File file = new File("D:\\test.txt");

		BufferedReader br = null;
		try {
			FileReader fr = new FileReader(file);
			br = new BufferedReader(fr);

			String line;

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("file not found:" + e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to reaf file:" + file.toString());
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
