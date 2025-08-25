package javadbconnect_casestudy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class courses {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url= "jdbc:mysql://localhost:3306/student_management";
		String username="root";
		String password="Mounidad@3";
		Connection conn=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(url, username, password);
			System.out.println("Connected to DB!");
			//conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		/*try {
			conn=DriverManager.getConnection(url,username,password);
			Statement stmt=conn.createStatement();
			String createSQL="CREATE TABLE courses (\r\n"+ " course_id INT AUTO_INCREMENT PRIMARY KEY,\r\n"+ " course_name VARCHAR(100),\r\n"+ " course_description TEXT,\r\n"+ " credits INT\r\n"+ ")";
			stmt.executeUpdate(createSQL);
			System.out.println("Table created successfully.");
			conn.close();
	}catch(Exception e) {
		e.printStackTrace();
	}*/
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("INSERT INTO courses (course_name, course_description, credits) VALUES ('Web Development', 'Learn HTML, CSS, JavaScript', 4)");
			stmt.executeUpdate("INSERT INTO courses (course_name, course_description, credits) VALUES ('Java Fullstack', 'Learn Java, DataBase, Servlets', 5)");
			stmt.executeUpdate("INSERT INTO courses (course_name, course_description, credits) VALUES ('DSA', 'Learn Java', 4)");

		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
