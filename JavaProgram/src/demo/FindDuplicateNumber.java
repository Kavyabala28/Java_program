package demo;

public class FindDuplicateNumber {

	public static void main(String[] args) {

		int[] num1 = { 0, 8, 6, 4, 2 };
		int[] num2 = { 1, 5, 7, 9, 8 };

		for (int i = 0; i < num1.length; i++) {
			for (int j = 0; j < num2.length; j++) {
				if (num1[i] == num2[j]) {
					System.out.println("Duplicate Number : " + num2[j]);
				}
			}
		}
	}

}
