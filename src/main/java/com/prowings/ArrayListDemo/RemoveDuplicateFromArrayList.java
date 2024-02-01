package com.prowings.ArrayListDemo;

import java.util.ArrayList;

public class RemoveDuplicateFromArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(10);
		al.add(10);
		al.add(10);
		al.add(30);

		System.out.println(al);

		for (int i = 0; i < al.size(); i++) {

			for (int j = i + 1; j < al.size(); j++) {

				if (al.get(i).equals(al.get(j))) {

					al.remove(j);

					j--;

//					size--;

				}

			}

		}

		System.out.println("Unique ArrayList is : "+al);
	}

}
