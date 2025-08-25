package javafilehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "info.txt";
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            
            while ((line = reader.readLine()) != null) {
                lineCount++;
                
                // Count words in the line (split by whitespace)
                String[] words = line.split("\\s+");
                wordCount += words.length;
                
                // Count characters (excluding spaces)
                for (String word : words) {
                    charCount += word.length();
                }
            }
            
            System.out.println("File Analysis Results:");
            System.out.println("Total lines: " + lineCount);
            System.out.println("Total words: " + wordCount);
            System.out.println("Total characters (excluding spaces): " + charCount);
            
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
	}

}
