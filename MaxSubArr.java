package com.basicstruct.gaurav;

public class MaxSubArr {
	int[] arr = { 1,-3,2,-5,7,6,-1,-4,11,-23 };
	int start = 0, end = arr.length - 1;

	int calc(int start, int end, int[] arr) {
		int suml = 0, sumr = 0, mid, sum = 0;
		Integer leftsum = Integer.MIN_VALUE, rightsum = Integer.MIN_VALUE;
		if (start == end) {
			System.out.println(arr[start]);
			return (arr[start]);
		} else {
			mid = (start + end) / 2;
			System.out.println("S-"+start+"e-"+end+"mid-"+mid);
			suml = calc(start, mid, arr);
			sumr = calc(mid + 1, end, arr);
			for (int i = mid; i >= start; i--) {
				sum += arr[i];
				System.out.println("s-"+sum);
				leftsum = Math.max(sum, leftsum);
				System.out.println("ls-"+leftsum);
			}
			sum = 0;
			for (int i = mid+1; i <= end; i++) {
				sum += arr[i];
				System.out.println("s-"+sum);
				rightsum = Math.max(sum, rightsum);
				System.out.println("rs-"+rightsum);
			}
			System.out.println("executed"+Math.max(Math.max(suml, sumr),rightsum+leftsum));
			return (Math.max(Math.max(suml, sumr),rightsum+leftsum));
			
		}
	}

	void start() {
		System.out.println(calc(start, end, arr));
	}

	public static void main(String[] args) {
		MaxSubArr obj = new MaxSubArr();
		obj.start();

	}

}
