package demo;

import java.util.ArrayList;
import java.util.List;

public class ListConcept {

	public static void main(String[] args) {

		List<String> name = new ArrayList<String>();

		name.add("Roy");
		name.add("Raj");
		name.add("Rio");

		System.out.println("List of names are " + name);

		/* To Access any list using index position */
		String firstIndexName = name.get(1);
		System.out.println("Name of 1st Index : " + firstIndexName);

	}

}
