package javafilehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task6 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			 Scanner sc = new Scanner(System.in);
			 try {
			 BufferedWriter writer = new BufferedWriter(new
			FileWriter("userdata.txt"));
			 System.out.print("Enter Name: ");
			 writer.write("Name: " + sc.nextLine() + "\n");
			 System.out.print("Enter Email: ");
			 writer.write("Email: " + sc.nextLine() + "\n");
			 System.out.print("Enter Address: ");
			 writer.write("Address: " + sc.nextLine() + "\n");
			 writer.close();
			 System.out.println("Data saved.");
			 } catch (IOException e) {
			 e.printStackTrace();
			 }
			 sc.close();
	}

}
