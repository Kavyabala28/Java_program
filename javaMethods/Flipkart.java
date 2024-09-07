package javaMethods;

public class Flipkart extends Amazon {

	/*
	 * Extends keyword is used to declare a class that inherits from another class,
	 * known as the superclass.
	 */

	public void sale() {
		System.out.println("Big Billion Days");
	}

	public static void main(String[] args) {

		Flipkart fk = new Flipkart();
		fk.sale();

		/* Using flipkart object accessing Amazon methods */

		fk.discount();
		fk.purchase();
	}
}
