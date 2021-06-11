package com.techlab.student.test;

import java.util.*;
import com.techlab.model.Student;

public class HashSetStudentTest {
	public static void main(String[] args) {
		Set<Student> s1 = new HashSet<Student>();
		s1.add(new Student(1,"q","a",8.9));
		s1.add(new Student(1,"r","b",9.2));
		s1.add(new Student(2,"s","a",9.5));
		s1.add(new Student(1,"t","a",9.7));
		Iterator<Student> itr = s1.iterator();
		while(itr.hasNext()) {
			Student currentStudent = itr.next();
			System.out.println(currentStudent.getId()+" "+currentStudent.getName()+" "+currentStudent.getStandard()+" "+currentStudent.getCgpa());
		}
	}
}
