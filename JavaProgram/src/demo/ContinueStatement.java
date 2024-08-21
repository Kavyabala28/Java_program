package demo;

public class ContinueStatement {

	public static void main(String[] args) {

		int num = 15;

		/*
		 * Continue statement breaks one iteration (in the loop), if a specified
		 * condition occurs, and continues with the next iteration in the loop.
		 */

		for (int i = 1; i <= num; i++) {
			if (i == 7) {
				continue;
			}

			System.out.println(i);
		}

	}

}
