package com.techlab.test;

import java.util.*;

public class TreeSetTTest {

	public static void main(String[] args) {
		Set<String> s1 = new TreeSet<String>();
		s1.add("GOT");
		s1.add("BB");
		s1.add("MOUSE");
		System.out.println("After Adding:");
		Iterator<String> itr = s1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		s1.add("Leo");
		System.out.println("After Updating:");
		for(String s: s1) {
			System.out.println(s);
		}
		s1.remove("GOT");
		System.out.println("After Removing:");
		for(String s: s1) {
			System.out.println(s);
		}
	}

}
