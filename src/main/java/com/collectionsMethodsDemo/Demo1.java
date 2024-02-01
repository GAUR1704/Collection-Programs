package com.collectionsMethodsDemo;

import java.util.*;

public class Demo1 {

	public static void main(String[] args) {

		ArrayList<String> myList = new ArrayList<String>();

		myList.add("ccc");
		myList.add("eee");
		myList.add("bbb");
		myList.add("ddd");
		myList.add("aaa");
		myList.add("fff");

		System.out.println("Before Sorting : " + myList);

		Collections.sort(myList);

		System.out.println("After Sorting : " + myList);

		System.out.println(Collections.binarySearch(myList, "ccc"));

		Student s1 = new Student(10, "aaa", "pune");
		Student s3 = new Student(30, "ccc", "nagpur");
		Student s2 = new Student(20, "bbb", "mumbai");

		Student[] std = { s1, s2, s3 };

		List<Student> stdList = Arrays.asList(std);

		System.out.println("Before sorting " + stdList);

		Collections.sort(stdList);

		System.out.println("After sorting : " + stdList);

		Person p1 = new Person("Ram", 10, "Pune");
		Person p2 = new Person("Sham", 20, "Mumbai");
		Person p3 = new Person("Gurav", 30, "Banglore");

		LinkedList<Person> personList = new LinkedList<Person>();

		personList.add(p3);
		personList.add(p1);
		personList.add(p2);

		System.out.println("<<<<<<<<<<<<<<<PersonNameComparator<<<<<<<<<<<<<<<<<");
		
		System.out.println("Before sorting by name : " + personList);

		Collections.sort(personList, new PersonNameComparator());

		System.out.println("After sorting by name : " + personList);
		
		
		System.out.println("<<<<<<<<<<<<<PersonIdComparator<<<<<<<<<<<<<");

		System.out.println("Before sorting by name : " + personList);

		Collections.sort(personList, new PersonIdComparator());

		System.out.println("After sorting by name : " + personList);
		
		
		System.out.println("<<<<<<<<<<<<<PersonAddressComparator<<<<<<<<<<<<<<<<");
		
		System.out.println("Before sorting by name : " + personList);
		
		Collections.sort(personList, new PersonAddressComparator());
		
		System.out.println("After sorting by name : " + personList);

	}

}
