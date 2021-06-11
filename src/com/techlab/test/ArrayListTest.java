package com.techlab.test;
import java.util.*;
public class ArrayListTest {
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		l1.add("Hi");
		l1.add("Hello");
		l1.add("Bye");
		for(int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i));
		}
		l1.set(l1.indexOf("Hello"), "Hello Siri!!!");
		for(int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i));
		}
		l1.remove("Bye");
		for(int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i));
		}
	}
}
