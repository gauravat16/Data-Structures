package com.basicstruct.gaurav;

public class InsertionSort {

	int[] baseData = { 5, 4, 3, 2, 6, 7, 8, 4, 3 };

	void compare() {
		for (int i = 0; i < 9; i++) {

			for (int j = 0; j < i; j++) {
				if (baseData[j] > baseData[i]) {
					int middleware = baseData[i];
					baseData[i] = baseData[j];
					baseData[j] = middleware;
				}
			}
		}
	}

	void print() {
		for (int i = 0; i < 9; i++) {
			System.out.print(baseData[i]);
		}
	}

	public static void main(String[] args) {

		InsertionSort Is = new InsertionSort();
		Is.compare();
		Is.print();

	}

}
