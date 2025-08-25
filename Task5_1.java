package javacollections;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    private String name;
    private int marks;
    // Constructor
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    public String getName() {
        return name;
    }
    public int getMarks() {
        return marks;
    }
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.marks, other.marks);
    }
    // Override toString for easy printing
    @Override
    public String toString() {
        return "Student{name='" + name + "', marks=" + marks + "}";
    }
}

public class Task5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 70));
        students.add(new Student("Charlie", 90));
        students.add(new Student("David", 75));
        System.out.println("Students before sorting:");
        for (Student student : students) {
            System.out.println(student);
        }
        // Sort the students by marks
        Collections.sort(students);
        System.out.println("\nStudents after sorting by marks:");
        for (Student student : students) {
            System.out.println(student);
        }
	}

}
