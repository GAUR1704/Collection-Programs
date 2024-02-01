package com.prowings.enums;

import java.util.Scanner;

public class TestDays {
	
	public static Days days;
	
	public TestDays(Days day) {
		this.days = day;
	}

	public static void main(String[] args) {
		
		String result = daysFeelLike(Days.THURSDAY);
		System.out.println(result);
		
		System.out.println(days.FRIDAY.name());
		
		System.out.println(days.SUNDAY.ordinal());
		
		System.out.println(days.MONDAY);
		
		String s = Days.MONDAY.toString();
		
		System.out.println(s);
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a day : ");
		
		String input = scan.next();
		
		System.out.println(daysFeelLike(Days.valueOf(input)));
		
		

	}

	public static String daysFeelLike(Days day) {
		
		String result = "";
		
		switch(day) {
		
		case MONDAY:
			
			result = "Boaring!!";
			break;
			
			
		case FRIDAY:
			
			result = "Exiting... Last day of week!!";
			break;
			
			
		case SATURDAY: case SUNDAY:
			
			result = "Weekends are best!!!";
			break;
			
			default:
			result = "Midweek days are so-so";
			
		
		}
		return result;
		
	}

}
