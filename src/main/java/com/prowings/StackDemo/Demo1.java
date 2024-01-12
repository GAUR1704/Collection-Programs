package com.prowings.StackDemo;

import java.util.Stack;

public class Demo1 {

	public static void main(String[] args) {

		Stack<Object> stack = new Stack<Object>();

		stack.push("Hello");
		stack.push("Hiii");
		stack.push(123);
		stack.push(456);
		stack.push(null);
		stack.push(123);
		stack.push("Hello");
		stack.push(null);

		System.out.println(stack);

		stack.pop();

		System.out.println(stack);

		System.out.println(stack.isEmpty());

		System.out.println(stack.peek());

		System.out.println(stack);

		System.out.println(stack.search(null));

	}

}
