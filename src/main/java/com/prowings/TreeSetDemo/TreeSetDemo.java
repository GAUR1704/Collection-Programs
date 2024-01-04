package com.prowings.TreeSetDemo;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<Object> t=new TreeSet<>();
		
		StringBuffer s1= new StringBuffer("vaibhav");
		StringBuffer s2= new StringBuffer("khalipe");
		StringBuffer s3= new StringBuffer("kolhapur");
		StringBuffer s4= new StringBuffer("pune");
		StringBuffer s5= new StringBuffer("mumbai");
		
		t.add(s5);
		t.add(s4);
		t.add(s3);
		t.add(s2);
		t.add(s1);
		System.out.println(t);
		
	}
}
