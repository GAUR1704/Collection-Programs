package com.collectionsMethodsDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Demo4 {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("AAA");
		al.add("BBB");
		al.add("CCC");
		al.add("AAA");
		al.add(null);
		
		System.out.println(al);
		
		Collections.swap(al, 1, 4);
		
		System.out.println(al);
		
		Collections.shuffle(al);
		
		System.out.println("After suffling "+ al);
		
		Collections.fill(al, "XXX");
		
		System.out.println(al);
		

	}

}
