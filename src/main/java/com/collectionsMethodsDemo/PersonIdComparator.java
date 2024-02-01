package com.collectionsMethodsDemo;

import java.util.Comparator;

public class PersonIdComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {

		if (p1.getId() == p2.getId())
			return 0;
		else if (p1.getId() > p2.getId())
			return 1;
		else
			return -1;

	}

}
