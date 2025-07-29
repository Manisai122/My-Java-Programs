package main;

import java.io.*;
import java.util.*;

public class ReadingFilesUsingScanner {

	public static void main(String[] args) throws FileNotFoundException  {
		// TODO Auto-generated method stub
		String filename="C:/Users/ADMIN/Desktop/names.txt";
		
		File textFile=new File(filename);
		
		Scanner in=new Scanner(textFile);
		int value=in.nextInt();
		System.out.println("read number:"+value);
		//there will we be a invisible character
		in.nextLine();
		
		int count=2;
		while(in.hasNextLine()) {
			String line=in.nextLine();
			System.out.println(count + ": " +line);
			count++;
		}
		
		in.close();
	}

}
