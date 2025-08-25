package javafilehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int wordCount = 0;
		 try {
		 BufferedReader reader = new BufferedReader(new
		FileReader("info.txt"));
		 String line;
		 while ((line = reader.readLine()) != null) {
		 String[] words = line.trim().split("\\s+");
		 wordCount += words.length;
		 }
		 reader.close();
		 System.out.println("Total words: " + wordCount);
		 } catch (IOException e) {
		 e.printStackTrace();
		 }
	}

}
