package demo;

public class Encapsulation {

	private int creditCardPin;

	public int getCardPin() {
		return creditCardPin;
	}

	public void setCardPin(int pin) {
		this.creditCardPin = pin;
	}

	public static void main(String[] args) {
		Encapsulation ep = new Encapsulation();
		ep.setCardPin(1234);
		System.out.println(ep.getCardPin());
	}
}
