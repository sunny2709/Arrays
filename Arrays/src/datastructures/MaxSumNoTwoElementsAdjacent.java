package datastructures;

public class MaxSumNoTwoElementsAdjacent {

	public static void main(String[] args) {
		findInN2();
		findInN();
	}

	private static void findInN2() {
		int[] arr = { 5, 5, 10, 40, 50, 35 };
		int sum = -1;
		int max_sum = -1;
		for (int i = 0; i < arr.length; i++) {
			sum = arr[i];
			int j = i + 2;
			while (j < arr.length) {
				if (j + 1 < arr.length && arr[j + 1] > arr[j]) {
					sum += arr[j + 1];
					j = j + 3;
				} else {
					sum += arr[j];
					j = j + 2;
				}
			}
			if (max_sum < sum) {
				max_sum = sum;
			}
		}
		System.out.println(max_sum);
	}

	private static void findInN() {
		int[] arr = { 5, 5, 10, 40, 50, 35 };
		int inclusive = arr[0];
		int exlusive = 0;
		int excl_new;
		for (int i = 1; i < arr.length; i++) {

			/* current max excluding i */
			excl_new = (inclusive > exlusive) ? inclusive : exlusive;

			/* current max including i */
			inclusive = exlusive + arr[i];

			/*
			 * exclude the current element and can include the previous element i.e include
			 * the previous element so take max of exclude and include
			 */
			exlusive = excl_new;

		}

		/* return max of incl and excl */
		System.out.println(((inclusive > exlusive) ? inclusive : exlusive));
	}
}
