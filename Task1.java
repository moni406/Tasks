package javadbconnect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url= "jdbc:mysql://localhost:3306/wiprodb_two";
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
		String createSQL ="CREATE TABLE Students(id INT PRIMARY KEY, name VARCHAR(40), email VARCHAR(100))";
		stmt.executeUpdate(createSQL);
		System.out.println("Table created uccessfully.");
		conn.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}*/
		/*try {
			Statement stmt = conn.createStatement();
			
			stmt.executeUpdate("INSERT INTO Students VALUES (1, 'Alice','alice@example.com')");
			stmt.executeUpdate("INSERT INTO Students VALUES (2, 'Bob','bob@example.com')");
			System.out.println("Data inserted.");

			}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Students");
			while (rs.next()) {
			 System.out.println(rs.getInt("id") + " - " + rs.getString("name") + " - "
			+ rs.getString("email"));
			}}
			catch(Exception e){
				e.printStackTrace();
				
			}
		/*try {
			String sql = "INSERT INTO Students (id, name, email) VALUES (?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 3);
			pstmt.setString(2, "Charlie");
			pstmt.setString(3, "charlie@example.com");
			pstmt.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		try {
			String sql = "UPDATE Students SET email = ? WHERE id = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "newbob@example.com");
			pstmt.setInt(2, 2);
			pstmt.executeUpdate();

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter name to search: ");
			String name = sc.nextLine();
			String sql = "SELECT * FROM Students WHERE name = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
			 System.out.println(rs.getInt("id") + " - " + rs.getString("name") + " - "
			+ rs.getString("email"));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		}
	}
		