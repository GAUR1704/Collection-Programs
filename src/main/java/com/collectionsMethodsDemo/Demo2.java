package com.collectionsMethodsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Demo2 {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
		al.add("ddd");
		al.add("eee");
		al.add("ccc");
		
		System.out.println(al);
		
		Collections.sort(al);
		
		System.out.println(Collections.binarySearch(al, "ccc"));
		
		
		Person p1 = new Person("Ram", 10, "pune");
		Person p2 = new Person("Gurav", 30, "nagpur");		
		Person p3 = new Person("Sham", 20, "mumbai");
		
		LinkedList<Person> myList= new LinkedList<Person>();
		
		myList.add(p3);
		myList.add(p1);
		myList.add(p2);
		
		System.out.println("Before Sorting" + myList);
		
		Collections.sort(myList, new PersonAddressComparator());;
		
		System.out.println("After Sorting" + myList);
		
		
		
		

	}

}
