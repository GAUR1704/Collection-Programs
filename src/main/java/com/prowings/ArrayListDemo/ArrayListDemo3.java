package com.prowings.ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ArrayListDemo3 {

	public static void main(String[] args) {

//		ArrayList al1 = new ArrayList();
		LinkedList<Object> al1 = new LinkedList<>();

		al1.add("Hello");
		al1.add(123);
		al1.add(null);
		al1.add('a');

		Iterator itr = al1.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");

		ListIterator<Object> ltr = al1.listIterator();

		while (ltr.hasNext()) {

			System.out.println(ltr.next());
		}

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");

		ListIterator<Object> ltr1 = al1.listIterator(4);

		while (ltr1.hasPrevious()) {

			System.out.println(ltr1.previous());

		}

	}
}
