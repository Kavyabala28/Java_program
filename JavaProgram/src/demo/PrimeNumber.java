package demo;

public class PrimeNumber {

	public static void main(String[] args) {

		int num = 79;

		int count = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}

		}

		if (count == 2)
			System.out.println(num + " is a Prime Number");
		else
			System.out.println(num + " is not a Prime Number");
	}

}
