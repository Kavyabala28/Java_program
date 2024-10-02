package demo;

public class StaticKeyword {

	static void m1() {   // static method
		System.out.println("m1 from static method");
	}

	public static void main(String[] args) {

		// static method can be called directly without creating an object
		m1();

	}
}
