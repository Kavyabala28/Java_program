package MethodOverloading;

public class Calculator {
	
	/*
	 * Method Overloading - when methods in the same class have the same method name
	 * but different parameters.
	 */

	public void addition(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("Addition of num1 and num2 is " + sum);
	}

	public void addition(int num1, int num2, int num3) {
		int sum = num1 + num2 + num3;
		System.out.println("Addition is " + sum);
	}

	public void addition(int num1, int num2, int num3, int num4) {
		int sum = num1 + num2 + num4;
		System.out.println("Addition is " + sum);
	}

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.addition(30, 20);
		cal.addition(12, 6, 5);
		cal.addition(4, 76, 5, 9);

	}

}
