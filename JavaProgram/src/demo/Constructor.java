package demo;

public class Constructor {
	
	int id;
	String name;
	
	// Default Constructor
    public Constructor() {
		System.out.println("It is a default constructor");
	}

	// Parameterized Constructor
	public Constructor(int id, String name) {
		this.id = id;     // Assigning parameters to instance variables
		this.name = name;
		System.out.println("It is a Parameterized constructor");
		System.out.println("Id: " +id +"\nName: " +name);
	}

	public static void main(String[] args) {
      
		// Creating an object using the parameterized constructor
		Constructor con = new Constructor(1, "Kavya");
		
		// Creating an object using the default constructor
		Constructor con2 = new Constructor();
		
	} 
}
