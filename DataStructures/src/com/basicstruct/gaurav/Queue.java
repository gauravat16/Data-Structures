package com.basicstruct.gaurav;

import java.util.Scanner;

public class Queue {
	Scanner in = new Scanner(System.in);
	int head = 0, tail = 0, value;
	Integer[] queue = new Integer[15];

	void insertValues() {
		for (int i = 0; i < 15; i++) {
			queue[i] = null;
		}
		for (int i = 0; i <= 10; i++) {
			queue[i] = i;

			tail = i + 1;
		}

	}

	void check() {
		if (head == 0 && tail == 0) {
			System.out.println("Queue Underflow");
			System.exit(0);
		}

		if (head == tail + 1) {
			System.out.println("Queue Overflow");
			System.exit(0);
		}
	}

	void enqueue() {
		check();
		if (tail == queue.length) {
			tail = 0;
		}
		addvalue();
		queue[tail] = value;
		tail++;

		print();

	}

	void dequeue() {
		check();
		if (head == queue.length) {
			head = 0;
		}
		queue[head] = null;
		head++;
		print();

	}

	void print() {
		for (int i = 0; i < queue.length; i++) {
			System.out.println(queue[i]);
		}

	}

	void start() {

		insertValues();
		System.out.println("1.Enqueue" + "\n" + "2.Dequeue");

		int value = in.nextInt();
		while (value == 1 || value == 2) {
			if (value == 1) {
				enqueue();

			} else {
				dequeue();

			}
			System.out.println("1.Enqueue" + "\n" + "2.Dequeue");
			value = in.nextInt();
		}

	}

	void addvalue() {

		value = in.nextInt();

	}

	public static void main(String[] args) {
		Queue obj = new Queue();
		obj.start();

	}

}
