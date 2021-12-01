package com.scuba.training;

public class AccessModifiers {

	public static void main(String[] args) {
		PrivateModifiers d = new PrivateModifiers();
		//d.name="Private error"; Accessing Private variable directly throws error
		
        // access the private variable using the getter and setter
        d.setName("PrivateAccessModifier");
        System.out.println(d.getName());

	}

}

//Private Modifiers Example
class PrivateModifiers {
    private String name;

    // getter method
    public String getName() {
        return this.name;
    }
    // setter method
    public void setName(String name) {
        this.name= name;
    }
}

//Protected Modifier Example

class ProtectedExample {
    // protected method
    protected void display() {
        System.out.println("I am an Protected Method");
    }
}

class Example extends ProtectedExample {
    public static void main(String[] args) {

        // create an object of Protected Example class
    	ProtectedExample a = new ProtectedExample();
         // access protected method
        a.display();
    }
}


//Public Modifier Example 

 class PublicModifier {
    // public variable
    public int count;

    // public method
    public void display() {
        System.out.println("I am an Public Method.");
        System.out.println("Count is " + count);
    }
}

// Main.java
 class Main {
    public static void main( String[] args ) {
        // accessing the public class
    	PublicModifier b = new PublicModifier();

        // accessing the public variable
        b.count = 4;
        // accessing the public method
        b.display();
    }
}
