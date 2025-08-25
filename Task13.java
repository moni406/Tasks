package javafilehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task13 {
	 public static void main(String[] args) throws IOException {
	 BufferedReader br = new BufferedReader(new FileReader("data.txt"));
	 BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
	 String line;
	 while ((line = br.readLine()) != null)
	 bw.write(line.replace("Java", "Python") + "\n");
	 br.close();
	 bw.close();
	 }
	}
