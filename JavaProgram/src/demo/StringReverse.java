package demo;

public class StringReverse {

	public static void main(String[] args) {

		String name = "Java Programming";

		char[] nameChar = name.toCharArray();

		for (int i = nameChar.length-1; i >= 0; i--)

		{
			System.out.println(nameChar[i]);
		}
	}

}
