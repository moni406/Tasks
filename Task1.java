package javafilehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedWriter writer= new BufferedWriter(new FileWriter("info.txt", true));
			writer.write("Java I/O is powerful!\n");
					writer.write("Learn Java step-by-step\n");
							writer.close();
							System.out.println("File written successfully.");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
