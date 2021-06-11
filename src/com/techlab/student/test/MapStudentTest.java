package com.techlab.student.test;

import java.util.*;
import com.techlab.model.Student;

public class MapStudentTest {

	public static void main(String[] args) {
		Map<Integer, Student> s1 = new HashMap<Integer, Student>();
		s1.put(101,new Student(1,"d","a",8.9));
		s1.put(102,new Student(1,"e","b",9.2));
		s1.put(103,new Student(2,"f","a",9.5));
		s1.put(104,new Student(1,"g","a",9.7));
		System.out.println(s1);
	}
	
}
