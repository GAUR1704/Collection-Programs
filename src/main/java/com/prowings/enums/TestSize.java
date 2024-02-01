package com.prowings.enums;

import java.util.Scanner;

public class TestSize {
	
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter any shirt size :");
		
		String input = scan.next();
		
		System.out.println("You have entered : "+ input + " size");
		
		Size s = Size.valueOf(input);
		
		System.out.println("THe number of enter size is " + s.getSize());
		
		System.out.println("The shirt prize is :"+s.calculatePrize());
		
		scan.close();
	}
	
	

}
