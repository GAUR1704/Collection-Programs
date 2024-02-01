package com.collectionsMethodsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo7 {

	public static void main(String[] args) {

		List<String> myList = new ArrayList<String>();

		myList.add("aaa");
		myList.add("bbb");
		myList.add("zzz");
		myList.add("zzz");
		myList.add("zzz");
		myList.add("zzz");
		myList.add("fff");
		myList.add("yyy");

		System.out.println(myList);

		Collections.synchronizedList(myList);
		
System.out.println("Frequency"+Collections.frequency(myList, "zzz"));		
		

		List<String> l = myMothod(myList);
		
		l.add("XZXZX");

//		System.out.println(l.set(0, "AAA"));

		System.out.println(l);

	}

	public static List<String> myMothod(List<String> myList) {

		return Collections.unmodifiableList(myList);
	}

}
