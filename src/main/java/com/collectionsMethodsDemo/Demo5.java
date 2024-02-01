package com.collectionsMethodsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo5 {

	public static void main(String[] args) {
		
		ArrayList<String> myList = new ArrayList<String>();
		
		myList.add("AAA");
		myList.add("BBB");
		myList.add("CCC");
		myList.add("DDD");
		
		System.out.println("Before rotate "+ myList);
		
		Collections.rotate(myList, 2);
		
		System.out.println("After rotate "+ myList);
		
		
		ArrayList<String> myList2 = new ArrayList<String>();
		
		myList2.add("");
		myList2.add("");
		myList2.add("GGG");
		myList2.add("GGG");
		myList2.add("GGG");
		myList2.add("");
		myList2.add("");
		myList2.add("");
		
		Collections.copy(myList2,myList);
		
		System.out.println("Copied List :"+ myList2);

	}

}
