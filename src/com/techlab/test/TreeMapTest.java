package com.techlab.test;

import java.util.*;

public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap<Integer, String> t1 = new TreeMap<Integer, String>();
		t1.put(1, "Doctor Strange");
		t1.put(3, "Black Widow");
		t1.put(2, "Iron Man");
		t1.put(4, "Captain America");
		t1.put(5, "Falcon");
		Set s1 = t1.entrySet();
		Iterator itr = s1.iterator();
		while(itr.hasNext()) {
			Map.Entry entry=(Map.Entry)itr.next();  
	        System.out.println(entry.getKey()+" "+entry.getValue());  
		}
	}
}
