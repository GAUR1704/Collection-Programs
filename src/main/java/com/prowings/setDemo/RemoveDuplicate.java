package com.prowings.setDemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		
	Integer []input = {10,50,10,20,30,40,20,30,40,50};
	
	Integer []res = removeDuplicates(input);
	
	System.out.println(Arrays.toString(res));
	
	}

	public static Integer[] removeDuplicates(Integer[] input) {	
		
		List<Integer> ls = Arrays.asList(input);
		
		Collections.sort(ls);
		
		LinkedHashSet<Integer> hs = new LinkedHashSet<>(ls);
		
		Integer[]res = 	hs.toArray(new Integer[0]);
		
		return res;
	}
}
