package demo;

public class StringConcept {

	public static void main(String[] args) {

		String word = "Hello Sunshine";

		char[] charArray = word.toCharArray(); // 'H','e','l','l','o',' ','S','u','n','s','h','i','n','e'
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}

		System.out.println("Third index having char as " + word.charAt(3));
		System.out.println("String word contains 'o' : " + word.contains("o"));
		System.out.println(word.equalsIgnoreCase("hello sunshine"));
		System.out.println("Length of the string : " + word.length());
		System.out.println("After replacing space with '-' : " + word.replace(" ", "-"));

		String[] split = word.split(" "); // "Hello", "Sunshine"
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}

		System.out.println(word.toLowerCase()); // Convert string into lowercase
		System.out.println(word.toUpperCase()); // Convert string into uppercase

	}

}
