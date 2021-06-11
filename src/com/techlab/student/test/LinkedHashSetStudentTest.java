package com.techlab.student.test;

import java.util.*;
import com.techlab.model.Student;

public class LinkedHashSetStudentTest {
	public static void main(String[] args) {
		Set<Student> s1 = new LinkedHashSet<Student>();
		s1.add(new Student(1,"d","a",8.9));
		s1.add(new Student(1,"e","b",9.2));
		s1.add(new Student(2,"f","a",9.5));
		s1.add(new Student(1,"g","a",9.7));
		Iterator<Student> itr = s1.iterator();
		while(itr.hasNext()) {
			Student currentStudent = itr.next();
			System.out.println(currentStudent.getId()+" "+currentStudent.getName()+" "+currentStudent.getStandard()+" "+currentStudent.getCgpa());
		}
	}
}
