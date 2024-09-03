package demo;

import java.util.Arrays;

public class FindMissingNumber {

	public static void main(String[] args) {

		int[] num = { 9, 7, 5, 2, 6, 1, 4, 8 };

		int sum1 = 0, sum2 = 0;

		Arrays.sort(num);

		for (int i = 0; i < num.length; i++) {
			sum1 = sum1 + num[i];
		}

		for (int j = 0; j <= 9; j++) {
			sum2 = sum2 + j;
		}

		System.out.println("The Missing Number : " + (sum2 - sum1));
	}

}
