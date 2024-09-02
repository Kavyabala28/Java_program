package demo;

public class JavaObjectCreation {

	public void method1() {
		System.out.println("Method 1");
	}

	public void method2() {
		System.out.println("Method 2");
	}

	public static void main(String[] args) {

		/* Creating object using 'new' keyword */
		
        JavaObjectCreation jv = new JavaObjectCreation();
        
		/* Calling methods using an object name */
        
		jv.method1();      
		jv.method2();        
	}
}
