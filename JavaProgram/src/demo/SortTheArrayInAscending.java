package demo;

public class SortTheArrayInAscending {

	public static void main(String[] args) {

		int[] num = { 0, 10, 87, -4, -9, 200, -23 };
		int temp;

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
			
			System.out.println(num[i]);
		}

	}

}
