package javafilehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader reader=new BufferedReader(new FileReader("info.txt"));
			String line;
			while((line=reader.readLine())!=null)
				System.out.println(line);
			reader.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
