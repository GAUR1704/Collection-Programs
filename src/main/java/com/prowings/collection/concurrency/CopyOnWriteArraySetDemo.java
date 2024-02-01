package com.prowings.collection.concurrency;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {

	public static void main(String[] args) {
		
		CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
		
		set.add("String");
		set.add("Byte");
		set.add("Integer");
		set.add("Charector");
		
		System.out.println(set);
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			set.remove("Byte");
		}
		
		System.out.println(set);

	}

}
