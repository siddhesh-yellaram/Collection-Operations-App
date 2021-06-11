package com.techlab.test;

import java.util.*;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> l1 = new LinkedHashMap<Integer, String>();
		l1.put(2, "Thor");
		l1.put(1, "Loki");
		l1.put(4, "Wanda");
		l1.put(8, "Vision");
		l1.put(5, "Hulk");
		Set s1 = l1.entrySet();
		Iterator itr = s1.iterator();
		while(itr.hasNext()) {
			Map.Entry entry=(Map.Entry)itr.next();  
	        System.out.println(entry.getKey()+" "+entry.getValue());  
		}
	}

}
