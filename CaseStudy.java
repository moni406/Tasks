package javadbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CaseStudy {

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
			String createSQL="CREATE TABLE students (student_id INT AUTO_INCREMENT PRIMARY KEY, first_name VARCHAR(50), last_name VARCHAR(50), dob DATE, email VARCHAR(100) UNIQUE, phone VARCHAR(15), address TEXT)";
			stmt.executeUpdate(createSQL);
			System.out.println("Table created successfully.");
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}*/
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
		/*try {
			conn=DriverManager.getConnection(url,username,password);
			Statement stmt=conn.createStatement();
			String createSQL ="CREATE TABLE enrollments (enrollment_id INT AUTO_INCREMENT PRIMARY KEY,student_id INT,course_id INT,enrollment_date DATE,grade VARCHAR(2),FOREIGN KEY (student_id) REFERENCES students(student_id),FOREIGN KEY (course_id) REFERENCES courses(course_id))";
			stmt.executeUpdate(createSQL);
			System.out.println("Table created successfully.");
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}*/
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("INSERT INTO students (first_name, last_name, dob, email, phone, address) VALUES ('John', 'Doe', '2002-05-14', 'john.doe@example.com', '9876543210','123 Main St')");
			stmt.executeUpdate("INSERT INTO students (first_name, last_name, dob, email, phone, address) VALUES ('Joy', 'Don', '2001-08-14', 'joy.don@example.com', '4876543210','343 Main St')");
			stmt.executeUpdate("INSERT INTO students (first_name, last_name, dob, email, phone, address) VALUES ('swathi', 'mardana', '2002-05-12', 'mardana.swathi@example.com', '9876647210','345 st hyderabad ')");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("INSERT INTO courses (course_name, course_description, credits) VALUES ('Web Development', 'Learn HTML, CSS, JavaScript', 4)");
			stmt.executeUpdate("INSERT INTO courses (course_name, course_description, credits) VALUES ('Java Fullstack', 'Learn Java, DataBase, Servlets', 5)");
			stmt.executeUpdate("INSERT INTO courses (course_name, course_description, credits) VALUES ('DSA', 'Learn Java', 4)");

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("INSERT INTO enrollments ( enrollment_date, grade) VALUES (1, 1, CURDATE(), NULL)");
			stmt.executeUpdate("INSERT INTO enrollments ( enrollment_date, grade) VALUES (17, 15, CURDATE(), NULL)");
			stmt.executeUpdate("INSERT INTO enrollments ( enrollment_date, grade) VALUES (45, 4, CURDATE(), NULL)");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
