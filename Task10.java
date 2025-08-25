package javafilehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

class Student implements Serializable {
    private String name;
    private int rollNumber;
    
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    
    @Override
    public String toString() {
        return "Student [Name=" + name + ", Roll Number=" + rollNumber + "]";
    }
}
public class Task10 {
	public static void main(String[] args) {
        // Create list of students
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice Johnson", 101));
        students.add(new Student("Bob Smith", 102));
        students.add(new Student("Charlie Brown", 103));
        
        // Serialize the list
        serializeStudents(students, "students.ser");
        System.out.println("Students serialized to students.ser");
        
        // Deserialize the list
        ArrayList<Student> deserializedStudents = deserializeStudents("students.ser");
        System.out.println("\nDeserialized Students:");
        deserializedStudents.forEach(System.out::println);
    }
	private static void serializeStudents(ArrayList<Student> students, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(filename))) {
            oos.writeObject(students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static ArrayList<Student> deserializeStudents(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(filename))) {
            return (ArrayList<Student>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
