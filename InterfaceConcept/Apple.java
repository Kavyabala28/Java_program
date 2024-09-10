package InterfaceConcept;

public class Apple extends Mobile {

	public static void main(String[] args) {
		Apple apple = new Apple();
		apple.calling();
		apple.message();
	}

	@Override
	public void calling() {
		System.out.println("Calling.....");

	}

	@Override
	public void message() {
		System.out.println("Message....");

	}

}
