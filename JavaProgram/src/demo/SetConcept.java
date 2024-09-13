package demo;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetConcept {

	public static void main(String[] args) {

		// creating LinkedHashSet using the Set
		Set<String> data = new LinkedHashSet<String>();

		data.add("Java");
		data.add("Set");
		data.add("Example");
		data.add("Set"); // Set does not allow duplicate values

		System.out.println(data);

	}

}
