package demo;

public class StringEqualsMethods {

	/*
	 * In Java, the == operator checks whether two references point to the same
	 * memory location (i.e., they refer to the exact same object)
	 */

	public static void main(String[] args) {

		String name1 = "Angel";
		String name2 = "Angel";
		String name3 = new String("Angel");
		String name4 = new String("angel");

		/*
		 * Return true, since both name1 and name2 are pointing to the same literal
		 * "Angel", they point to the same memory location in the string pool.
		 */
		System.out.println(name1 == name2);

		/*
		 * Here, name3 is created using the new keyword. This forces Java to create a
		 * new String object on the heap. So, name1 and name3 do not reference the same
		 * object. Therefore returns false.
		 */

		System.out.println("Before using equals method : " + (name1 == name3));

		/*
		 * If you want to compare the actual contents of the strings (instead of their
		 * references), use the .equals() method
		 */

		System.out.println("After using equals method : " +name1.equals(name3));
	}

}
