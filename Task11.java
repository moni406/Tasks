package javafilehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task11 {
	 public static void main(String[] args) {
	 try {
	 BufferedReader reader = new BufferedReader(new FileReader("nofile.txt"));
	 reader.readLine();
	 } catch (FileNotFoundException e) {
	 System.out.println("File not found. Please check the filename.");
	 } catch (IOException e) {
	 e.printStackTrace();
	 }
	 }
	}
