package com.collectionsMethodsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo3 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		al.add("AAA");
		al.add("BBB");
		al.add("CCC");
		al.add("DDD");

		System.out.println(Collections.max(al));
		System.out.println(Collections.min(al));

		System.out.println("Before reverse " + al);

		Collections.reverse(al);

		System.out.println("After reverse " + al);

		String reversedString = reverseGivenString("hello world");

		System.out.println(reversedString);

	}

	public static String reverseGivenString(String input) {

		char[] chars = input.toCharArray();

		List<Character> charsList = new ArrayList<Character>();

		for (char c : chars)

			charsList.add(c);

		Collections.reverse(charsList);

//		System.out.println(charsList);

		char[] charArr = new char[charsList.size()];

		int index = 0;

		for (Character c1 : charsList) {

			charArr[index] = c1;
			index++;
		}

		return new String(charArr);

	}

}
