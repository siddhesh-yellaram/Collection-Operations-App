package com.techlab.student.test;

import com.techlab.model.*;
import java.util.*;

public class ListStudentTest {
	public static void main(String[] args) {
		List<Student> l1 = new ArrayList<Student>();
		l1.add(new Student(1,"d","a",8.9));
		l1.add(new Student(1,"e","b",9.2));
		l1.add(new Student(2,"f","a",9.5));
		l1.add(new Student(1,"g","a",9.7));
		Iterator<Student> itr = l1.iterator();
		while(itr.hasNext()) {
			Student currentStudent = itr.next();
			System.out.println(currentStudent.getId()+" "+currentStudent.getName()+" "+currentStudent.getStandard()+" "+currentStudent.getCgpa());
		}
	}
}
