package javafilehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task7 {
	public static void main(String[] args) {
		
	try {
		 BufferedWriter writer = new BufferedWriter(new
		FileWriter("app.log", true));
		 String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		 writer.write("[" + timestamp + "] Application started\n");
		 writer.close();
		 } catch (IOException e) {
		 e.printStackTrace();
		 }
	}
}
