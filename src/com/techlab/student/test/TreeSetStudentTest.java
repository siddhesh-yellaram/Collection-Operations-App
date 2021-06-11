package com.techlab.student.test;

import java.util.*;

import com.techlab.model.Student;

public class TreeSetStudentTest {

	public static void main(String[] args) {
		TreeSet<Student> students = new TreeSet<Student>();
		Student s1= new Student(1,"Bruce","a",9.7);
		Student s2= new Student(1,"Selena","a",9.5);
		Student s3= new Student(2,"Clark","b",9.1);
		Student s4= new Student(2,"Diana","b",9.3);
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		Iterator<Student> itr = students.iterator();
		while(itr.hasNext()) {
			Student currentStudent = itr.next();
			System.out.println(currentStudent.getId()+" "+currentStudent.getName()+" "+currentStudent.getStandard()+" "+currentStudent.getCgpa());
		}
	}

}
