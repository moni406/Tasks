package javacollections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student2 {
    private String id;
    private String name;
    public Student2(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Student{id='" + id + "', name='" + name + "'}";
    }
}
public class Task5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student2> students = Arrays.asList(
	            new Student2("1", "Alice"),
	            new Student2("2", "Bob"),
	            new Student2("3", "Charlie"),
	            new Student2("4", "David")
	        );
	        Map<String, Student2> studentMap = students.stream()
	            .collect(Collectors.toMap(Student2::getId, student -> student));
	        // Print the resulting map
	        studentMap.forEach((id, student) -> {
	            System.out.println("ID: " + id + ", Student: " + student);
	        });
	}

}
