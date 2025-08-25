package javacollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student1 {
    private String name;
    private int marks;
    // Constructor
    public Student1(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    // Getters
    public String getName() {
        return name;
    }
    public int getMarks() {
        return marks;
    }
    // Override toString for easy printing
    @Override
    public String toString() {
        return "Student{name='" + name + "', marks=" + marks + "}";
    }
}
public class Task5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student1> students = new ArrayList<>();
        students.add(new Student1("Alice", 85));
        students.add(new Student1("Bob", 70));
        students.add(new Student1("Charlie", 90));
        students.add(new Student1("David", 75));
        System.out.println("Students before sorting by name:");
        for (Student1 student : students) {
            System.out.println(student);
        }
        // Sort the students by name using a Comparator
        Collections.sort(students, new Comparator<Student1>() {
            @Override
            public int compare(Student1 s1, Student1 s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });
        // Alternatively, using a lambda expression
        // Collections.sort(students, (s1, s2) -> s1.getName().compareTo(s2.getName()));
        System.out.println("\nStudents after sorting by name:");
        for (Student1 student : students) {
            System.out.println(student);
        }
    }

	}
