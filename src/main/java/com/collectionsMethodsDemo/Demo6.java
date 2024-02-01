package com.collectionsMethodsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo6 {

	public static void main(String[] args) {
		
		ArrayList<String> myList = new ArrayList<String>();
		
		myList.add("AAA");
		myList.add("BBB");
		myList.add("CCC");
		myList.add("EEE");
		myList.add("FFF");
		myList.add("GGG");
		myList.add("HHH");
		myList.add("III");
			
		
		ArrayList<String> targetList = new ArrayList<String>();
		
		myList.add("AAA");
		myList.add("BBB");
		myList.add("CCC");
		
		
		int index = Collections.lastIndexOfSubList(myList, targetList);
		
		if(index>= 0) 
			System.out.println("Target List presrent in SourceList at index : "+ index);
		else
		System.out.println("Target List is not present in Source List!!");

	}

}
