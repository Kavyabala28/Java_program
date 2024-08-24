package demo;

public class Palindrome {

	public static void main(String[] args) {

		int number = 1221;

		int rem, rev = 0;

		int output = number;

		while (output > 0) {

			rem = output % 10;
			rev = rev * 10 + rem;
			output = output / 10;
		}

		if (rev == number)
			System.out.println("Number is Palindrome");
		else
			System.out.println("Number is not Palindrome");
	}

}
