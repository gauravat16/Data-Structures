package com.basicstruct.gaurav;

public class BinarySearch {

	int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	int start = 0;
	int end = array.length, val = 4, mid;

	void start() {
		BinaryS(0, end, val);
	}

	void BinaryS(int s, int e, int val) {
		if (e > s) {
			mid = (s + e) / 2;

			if (val < array[mid]) {
				BinaryS(s, mid, val);
			}

			else if (val > array[mid]) {
				BinaryS(mid, e, val);
			}

			else {
				System.out.println("present");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch obj = new BinarySearch();
		obj.start();

	}

}
