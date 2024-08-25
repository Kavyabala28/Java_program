package demo;

public class SwapTwoNumber {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		int temp = 0;
		
		System.out.println("Before Swapping - number 1 : " +num1);
		System.out.println("Before Swapping - number 2 : " +num2);
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("--------------------------------");
		
		System.out.println("After Swapping - number 1 :"+num1);
		System.out.println("After Swapping - number 2 :"+num2);

	}

}
