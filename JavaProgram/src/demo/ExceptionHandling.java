package demo;

public class ExceptionHandling {

	public static void main(String[] args) {

		int[] num = { 0, 5, 6, 3, 7 };

		try {
			System.out.println(num[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index out of bound Exception");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}

	}
}
