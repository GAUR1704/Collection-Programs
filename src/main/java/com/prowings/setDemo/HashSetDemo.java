package com.prowings.setDemo;

import java.util.HashMap;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		System.out.println(hs.add("Hello"));
		System.out.println(hs.add(123));
		System.out.println(hs.add("Gaurav"));
		System.out.println(hs.add(null));
		System.out.println(hs.add(456));
		System.out.println(hs.add("Hello"));
		
		
		System.out.println(hs);
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		
		System.out.println(hm.put("AAA" , 123));
		System.out.println(hm.put("AAA", 111));
		System.out.println(hm.put("AAA", 888));
		
		System.out.println(hm);

	}

}
