package com.prowings.setDemo;

import java.util.HashSet;

public class TestStudent {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(10, "AAA");
		Student s2= new Student(20, "BBB");
		Student s3 = new Student(30, "CCC");
		Student s4 = new Student(10, "AAA");
		
		System.out.println(s1 == s4);
		
		System.out.println(s1.equals(s4));
		
		
		HashSet hs = new HashSet();
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		
		System.out.println(hs);
	}

}
