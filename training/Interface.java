package com.scuba.training;

//Using interface in the class
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Drawable d=new Circle();
		d.draw();		

	}

}

//Interface declaration  
interface Drawable{  
void draw();  
}  
//Implementation of Interface  

class Circle implements Drawable{  
public void draw(){System.out.println("drawing circle");}  
}  
  

