package javafilehandling;

import java.io.File;

public class Task15 {
 public static void main(String[] args) {
	 File dir = new File(".");
	 File[] files = dir.listFiles();
	 for (File file : files) {
	 System.out.println((file.isDirectory() ? "DIR " : "FILE") +
	 " - " + file.getName() + " - " + file.length() + "bytes");
	 
	 }
}
}
