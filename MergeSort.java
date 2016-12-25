package com.basicstruct.gaurav;

public class MergeSort {

	int[] baseData = { 5, 4, 3, 2, 6, 7, 8, 9, 11, 18 };
	int p = 1, q, r = baseData.length;
	int[] temp = new int[baseData.length];

	void sort(int[] baseData, int p, int r) {
		// System.out.println(baseData[1] +"sort"+p+"sort "+r);
		if (p < r) {
			q = (p + r) / 2;
			// System.out.println(p+" "+ q);
			sort(baseData, p, q);
			sort(baseData, q + 1, r);
			merge(baseData, p, q, r);
		}
	}

	void merge(int[] baseData, int p, int q, int r) {

		int n1 = q;
		int n2 = r - q;
		 System.out.println(p + " " + q+ "  value of r is:" + r);
		int[] left = new int[n1 + 1];
		int[] right = new int[n2 + 1];
		left[n1] = 99999;
		right[n2] = 99999;

		for (int i = 0; i < n1; i++) {

			left[i] = baseData[i];

		}

		for (int j = 0; j < n2; j++) {
			right[j] = baseData[q + j];

		}
		System.out.println("q is" + q);
		System.out.println("left");
		for (int i = 0; i < n1; i++) {
			System.out.println(left[i]);
		}
		System.out.println("right");
		for (int i = 0; i < n2; i++) {
			System.out.println(right[i]);
		}

		int i = 0;
		int j = 0;
		for (int k = 0; k < temp.length; k++) {
			System.out.println("k-"+k);
			if (left[i] != 99999 && right[j] != 99999) {
				if (left[i] < right[j]) {
					baseData[k+1]=baseData[k];
					

					baseData[k] = left[i];
					

					i++;
					System.out.println("i-"+i);

				} 
				else
					{if(left[i] > right[j])
				{
						baseData[k+1]=baseData[k];
					baseData[k] = right[j];

					j++;
					System.out.println("j-"+j);
				}
			}
			}

		}
		System.out.println("array");
		for (int l = 0; l < baseData.length; l++) {
			System.out.println(baseData[l]);
		}

	}

	void print() {
		for (int i = 0; i < 9; i++) {
			System.out.println("final answer" + baseData[i]);
		}
	}

	void start() {
		
		sort(baseData, p, r);
		print();
	}

	public static void main(String[] args) {
		MergeSort obj = new MergeSort();
		
		obj.start();

	}

}
