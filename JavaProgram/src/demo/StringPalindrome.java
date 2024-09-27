package demo;

public class StringPalindrome {

	public static void main(String[] args) {

		String name = "mam";

		String reverse = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			reverse = reverse + name.charAt(i);
		}

		if (name.equals(reverse)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}

	}

}
