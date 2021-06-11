package com.techlab.model;

import java.util.Objects;

public class Student implements Comparable<Student>{
	private int id;
	private String name;
	private String division;
	private double cgpa;
	
	public Student(int id, String name, String division, double cgpa) {
		this.id = id;
		this.name = name;
		this.division = division;
		this.cgpa = cgpa;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getStandard() {
		return division;
	}
	
	public double getCgpa() {
		return cgpa;
	}

	@Override
	public String toString() {
		return " Student Id: " + id + ", Name: " + name + ", Std.:" + division + ", CGPA: " + cgpa + "\n";
	}
	
	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		Student s = (Student) obj;
		if(!division.equals(s.division))
			return false;
		return true;
	}

	@Override
	public int compareTo(Student s)
    {
        if (id > s.id) {
            return 1;
        }
        else if (id < s.id) {
            return -1;
        }
        else {
        	if(!division.equals(s.division))
    			return 0;
    		return 1;
        }
    }
	
}
