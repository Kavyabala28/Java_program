package demo;

public class SwitchCase {

	public static void main(String[] args) {

		int num1 = 20, num2 = 10;
		int count = 3;

		switch (count) {
		case 1:
			System.out.println("Add the number 20 & 10 : " + (num1 + num2));
			break;
		case 2:
			System.out.println("Subtract the number 20 & 10 : " + (num1 - num2));
			break;
		case 3:
			System.out.println("Multiply the number 20 & 10 : " + (num1 * num2));
			break;
		case 4:
			System.out.println("Divide the number 20 & 10 : " + (num1 % num2));
			break;
		default:
			System.out.println("No operations");
		}

	}

}
