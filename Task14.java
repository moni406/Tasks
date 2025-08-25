package javafilehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task14 {
	 public static void main(String[] args) throws IOException {
	 BufferedWriter bw = new BufferedWriter(new FileWriter("merged.txt"));
	 BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
	 BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));
	 String line;
	 while ((line = br1.readLine()) != null) bw.write(line + "\n");
	 while ((line = br2.readLine()) != null) bw.write(line + "\n");
	 br1.close(); br2.close(); bw.close();
	 }
	}