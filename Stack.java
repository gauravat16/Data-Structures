package com.basicstruct.gaurav;

import java.util.Scanner;

public class Stack {
	Scanner in = new Scanner(System.in);
	Integer currentPosition = 0, value = 0;
	int flag;

	Integer[] stack = new Integer[15];

	void insertValues() {
		for (int i = 0; i < 15; i++) {
			stack[i] = null;
		}
		for (int i = 0; i <= 10; i++) {
			stack[i] = i;
			currentPosition = currentPosition + 1;
		}
	}

	void check() {
		if (stack[0] == null) {
			System.out.println("Stack underflow");
			flag = 1;
		}

		if (currentPosition == 15) {
			System.out.println("stack overflow");
			flag = 1;
		}

	}

	void addvalue() {
		
		value = in.nextInt();

	}

	void push() {
		check();
		if (flag == 1) {
			System.exit(0);
		} else {
			addvalue();
			stack[currentPosition] = value;
			currentPosition++;
			System.out.println(currentPosition);
		}
	}

	void pop() {
		check();
		if (flag == 1) {
			// System.exit(0);
		} else {
			stack[currentPosition] = null;
			currentPosition--;

		}
	}

	void start() {

		insertValues();
		System.out.println("1.push" + "\n" + "2.pop");
	
		int value = in.nextInt();
		while (value == 1 || value == 2) {
			if (value == 1) {
				push();
				for (int i = 0; i < 15; i++) {
					System.out.println(stack[i]);
				}
			} else {
				pop();
				for (int i = 0; i < 15; i++) {
					System.out.println(stack[i]);
				}

			}
			System.out.println("1.push" + "\n" + "2.pop");
			value = in.nextInt();
		}

	}

	public static void main(String[] args) {
		Stack obj = new Stack();
		obj.start();

	}

}
