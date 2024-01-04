package com.prowings.ArrayListDemo;

import java.util.ArrayList;


public class ArrayListDemo {

	public static void main(String[] args){
		
		ArrayList<Object> al = new ArrayList<>();
		
		al.add(123);
		al.add(null);
		al.add("Hi");
		al.add(12);
		
		System.out.println(al);
		
		al.remove(2);
		
		System.out.println(al);
		
		ArrayList<Object> al2 = new ArrayList<>();
		
		al2.add(456);
		al2.add("Hello");
		al2.add(null);
		al2.add(123);
		
		al2.addAll(al);
		
		System.out.println(al2);
		
		al2.removeAll(al2);
		
		
		System.out.println(al2);
		
		
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		
		
		al2.retainAll(al);
		
		System.out.println(al2);

		al2.clear();
		
		System.out.println(al2);

		System.out.println(al2.containsAll(al));
		
		System.out.println(al2.contains("Hi"));	
		
		System.out.println(al2.size());
		
		al2.clear();
		
		System.out.println(al2);
		
		System.out.println(al2.isEmpty());
		
		
	}

}
