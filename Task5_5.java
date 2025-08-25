package javacollections;

import java.util.PriorityQueue;
class Student_1 {
    String name;
    int score;
    Student_1(String name, int score) {
        this.name = name;
        this.score = score;
    }
}
public class Task5_5 
{
    public static void main(String[] args) {
        // Create a PriorityQueue with a custom comparator to sort by score in descending order
        PriorityQueue<Student_1> pq = new PriorityQueue<>((a, b) -> b.score - a.score);
        // Add students to the PriorityQueue
        pq.offer(new Student_1("Alice", 85));
        pq.offer(new Student_1("Bob", 92));
        pq.offer(new Student_1("Charlie", 88));
        pq.offer(new Student_1("David", 95));
        pq.offer(new Student_1("Eve", 90));
        System.out.println("Top 3 highest scoring students:");
        for (int i = 0; i < 3; i++) {
            if (!pq.isEmpty()) {
                Student_1 topStudent = pq.poll();
                System.out.println(topStudent.name + " with score: " + topStudent.score);
            }
        }
    }
}
