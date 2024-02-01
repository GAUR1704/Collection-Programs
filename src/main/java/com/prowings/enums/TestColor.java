package com.prowings.enums;

enum Color {

	RED, BLUE, GREEN, BLACK,

}

public class TestColor {

	public static void main(String[] args) {

		Color myColor = Color.GREEN;

		String result = getColorName(myColor);

		System.out.println(result);

	}

	public static String getColorName(Color myColor) {

		String result = "";

		switch (myColor) {

		case BLACK:

			result = "This color is Black !!!";
			break;

		case GREEN:

			result = "This color is Green !!!";
			break;

		case BLUE:

			result = "This color is Blue !!!";
			break;

		case RED:

			result = "This color is Red !!!";
			break;

		default:
			result = "Color not found !!!";

		}
		return result;

	}
}
