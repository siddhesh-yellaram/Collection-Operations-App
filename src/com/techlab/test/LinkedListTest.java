package com.techlab.test;

import java.util.*;

public class LinkedListTest {

	public static void main(String[] args) {
		List<String> l1 = new LinkedList<String>();
		l1.add("One");
		l1.add("Two");
		l1.add("Three");
		System.out.println("After Adding:");
		for(int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i));
		}
		l1.set(0, "Hello!!!");
		System.out.println("After Modifying:");
		for(int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i));
		}
		l1.remove(2);
		System.out.println("After Removing:");
		Iterator<String> itr = l1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
