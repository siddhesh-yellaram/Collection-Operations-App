package com.techlab.test;

import java.util.*;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Integer, String> m1 = new HashMap<Integer, String>();
		m1.put(1, "Hello");
		m1.put(7, "Hi");
		m1.put(3, "Bye!!!");
		m1.put(5, "Ok");
		m1.put(1, "H");
		Set s1 = m1.entrySet();
		Iterator itr = s1.iterator();
		while(itr.hasNext()) {
			Map.Entry entry=(Map.Entry)itr.next();  
	        System.out.println(entry.getKey()+" "+entry.getValue());  
		}
	}

}
