package com.prowings.ArrayListDemo;

import java.util.ArrayList;

public class ArrayDemo2 {

	public static void main(String[] args) {

		ArrayList<Object> al1 = new ArrayList<>();

		al1.add("Hello");
		al1.add(null);

		System.out.println(al1);

		ArrayList<Object> al2 = new ArrayList<>();

		al2.add("Hii");
		al2.add("Gaurav");
		

		System.out.println(al2);

		System.out.println(al1.hashCode());
		System.out.println(al2.hashCode());

		System.out.println(al2.equals(al1));

	}

}
