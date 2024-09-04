package demo;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String text = "We learn Java basics as part of java sessions in java week1";
		String updatedText = "";

		int count = 0;

		String[] splitText = text.split(" ");

		for (int i = 0; i < splitText.length; i++) {
			count = 0;
			for (int j = 0; j < splitText.length; j++) {
				if (splitText[i].equals(splitText[j])) {
					count++;
					if (count > 1) {
						updatedText = text.replace(splitText[i], "");
					}
				}
			}
		}

		System.out.println(updatedText);
	}

}
