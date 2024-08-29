package demo;

public class LengthOfTheString {

	public static void main(String[] args) {

		String name = "Java is a Programming Language";

		int count = 0;

		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) != ' ') {
				count++;
			}
		}

		System.out.println("Length of the string : " +count);

	}

}
