package com.collectionsMethodsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Demo8 {

	public static void main(String[] args) {

		String s = "Hello";
		Student s2 = new Student(10,"Ram", "pune");
		
		List<String> synchList = Collections.singletonList(s);
		
		System.out.println("Synchronized list "+synchList);
		
		s = s.concat("World");
		
		System.out.println("Synchonized List" + synchList);
		
		Map<String, Integer> syncMap = Collections.singletonMap("AAA",123);
		
		System.out.println(synchList);
		
		for(Map.Entry<String, Integer> entry : syncMap.entrySet())
		{
			Map.Entry<String, Integer> e = entry;
			
			entry.setValue(999);
		}

	}

}
