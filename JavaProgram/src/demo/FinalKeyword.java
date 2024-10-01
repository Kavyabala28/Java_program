package demo;

public class FinalKeyword {

	final int speedLimit = 100;

	public void run() { // We can't override the variable since it uses 'Final' keyword
		speedLimit = 140; // Compilation Error
	}

	public static void main(String[] args) {
		FinalKeyword f = new FinalKeyword();
		f.run();
	}
}
