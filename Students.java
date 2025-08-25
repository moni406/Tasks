package javadbconnect_casestudy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Students {
	
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
				String createSQL="CREATE TABLE students1 (student_id INT AUTO_INCREMENT PRIMARY KEY, first_name VARCHAR(50), last_name VARCHAR(50), dob DATE, email VARCHAR(100) UNIQUE, phone VARCHAR(15), address TEXT)";
				stmt.executeUpdate(createSQL);
				System.out.println("Table created successfully.");
				conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}*/
			try {
				Statement stmt = conn.createStatement();
				stmt.executeUpdate("INSERT INTO students1 (first_name, last_name, dob, email, phone, address) VALUES ('John', 'Doe', '2002-05-14', 'john.doe@example.com', '9876543210','123 Main St')");
				stmt.executeUpdate("INSERT INTO students1 (first_name, last_name, dob, email, phone, address) VALUES ('Joy', 'Don', '2001-08-14', 'joy.don@example.com', '4876543210','343 Main St')");
				stmt.executeUpdate("INSERT INTO students1 (first_name, last_name, dob, email, phone, address) VALUES ('swathi', 'mardana', '2002-05-12', 'mardana.swathi@example.com', '9876647210','345 st hyderabad ')");
				
			}
			catch(Exception e) {
				e.printStackTrace();
}
			try {
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM students");
				while (rs.next()) {
				 System.out.println(rs.getInt("student_id") + " - " + rs.getString("first_name") + " - "+ rs.getString("email"));
				}}
				catch(Exception e){
					e.printStackTrace();
					
				}
}
}