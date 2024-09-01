package demo;

public class FindOccurences {

	public static void main(String[] args) {

		String courseName = "Java Programming";
		int count;

		char[] charCourse = courseName.toCharArray();

		for (int i = 0; i < charCourse.length; i++) {
			count = 0;
			for (int j = i + 1; j < charCourse.length; j++) {
				if (charCourse[i] == charCourse[j]) {
					count++;
				}
			}
			System.out.println("The Occurence of " + charCourse[i] + " is " + count);
		}

	}

}
