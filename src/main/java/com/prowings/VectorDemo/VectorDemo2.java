package com.prowings.VectorDemo;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo2 {

	public static void main(String[] args) {

		Vector vector = new Vector();
		
//		ArrayList vector = new ArrayList();

		vector.add("Hello");
		vector.add(123);
		vector.add("Gaurav");
		vector.add(null);
		vector.add("Hello");

		System.out.println("Original Vector " + vector);

		System.out.println(">>>>>>>>>>>>>>>Enumaration demo<<<<<<<<<<<<<<<<<<<<<<");

		Enumeration emr = vector.elements();

		while (emr.hasMoreElements()) {

			System.out.println(emr.nextElement());
			
//			vector.remove(1);
		}
		
		System.out.println(">>>>>>>>>>>>>>>Iterator demo<<<<<<<<<<<<<<<<<<<<<<");
		
		Iterator itr = vector.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}
		
		System.out.println(">>>>>>>>>>>>>>>ListIterator Forward demo<<<<<<<<<<<<<<<<<<<<<<");
		
		ListIterator ltr = vector.listIterator();
		
	try {
		while (ltr.hasNext()){
			
			System.out.println(ltr.next());
			
			vector.add(11);
			
		}
		}
		
		catch (ConcurrentModificationException e) {
			System.out.println("Inside catch block !!!");
		}
			
		
		
		System.out.println(">>>>>>>>>>>>>>>ListIterator Backword demo<<<<<<<<<<<<<<<<<<<<<<");
		
		ListIterator ltr1 = vector.listIterator(5);
		
		while(ltr1.hasPrevious()) {
			
			System.out.println(ltr1.previous());
			//vector.remove(0);
			//ltr1.remove();
		}
		
		
		
 
	}

}
