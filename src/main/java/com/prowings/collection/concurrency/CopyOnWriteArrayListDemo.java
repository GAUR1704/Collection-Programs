package com.prowings.collection.concurrency;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
	
	public static void main(String[] args) {
		
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList();
		
		list.add("Java");
		list.add("Python");
		list.add("C++");
		list.add("JavaScript");
		list.add(".net");
		
		
		System.out.println(list);
		
		Iterator<String> itr = list.iterator();
		
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			list.add("Jango");
		}
				
		System.out.println(list);
	}

}
