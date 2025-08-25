package javadbconnect_casestudy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class enrollments {
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
		try {
			conn=DriverManager.getConnection(url,username,password);
			Statement stmt=conn.createStatement();
			String createSQL ="CREATE TABLE enrollments (enrollment_id INT AUTO_INCREMENT PRIMARY KEY,student_id INT,course_id INT,enrollment_date DATE,grade VARCHAR(2),FOREIGN KEY (student_id) REFERENCES students(student_id),FOREIGN KEY (course_id) REFERENCES courses(course_id))";
			stmt.executeUpdate(createSQL);
			System.out.println("Table created successfully.");
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("INSERT INTO enrollments ( student_id, course_id,enrollment_date, grade) VALUES (1, 1, CURDATE(), NULL)");
			stmt.executeUpdate("INSERT INTO enrollments (student_id, course_id, enrollment_date, grade) VALUES (17, 15, CURDATE(), NULL)");
			stmt.executeUpdate("INSERT INTO enrollments ( student_id, course_id,enrollment_date, grade) VALUES (45, 4, CURDATE(), NULL)");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
