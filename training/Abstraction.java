package com.scuba.training;

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//abstract class and Method 
abstract class Shape{  
abstract void draw();  
}

//Class implementing abstract class and method
class Rectangle extends Shape{  
void draw(){System.out.println("drawing rectangle");}  
}  
class Circle1 extends Shape{  
void draw(){System.out.println("drawing circle");}  
}  

//Calling abstract class using inherited class 
class TestAbstraction1{  
public static void main(String args[]){  
Shape s=new Circle1();  
s.draw(); 
Shape r=new Rectangle();
r.draw();
}  
}  
