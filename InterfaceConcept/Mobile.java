package InterfaceConcept;

public abstract class Mobile implements Iphone {
	
	/* Implements keyword is used to access the Interface */

	/*
	 * Abstract Class - It is used to provide common method implementation to all
	 * the subclasses or to provide default implementation
	 */

	public void camera() {
		System.out.println("Take a Snap");

	}

}
