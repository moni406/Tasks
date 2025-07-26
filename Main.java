package service;

import model.Student;
import service.studentservice;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.name="Krishna";
		s.age=18;
		studentservice ss=new studentservice();
		ss.printStudent(s);
	}
}