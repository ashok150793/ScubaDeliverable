package com.scuba.training;

import java.util.*; 

public class ArrayListExample{  
 public static void main(String args[]){  
  ArrayList<String> al=new ArrayList<String>();  //declaring array list of string type  
  al.add("Mango");  //adding the elements
  al.add("Apple");  
  al.add("Banana");  
  al.add("Grapes");  
  //accessing the element    
  System.out.println("Returning element: "+al.get(1));//it will return the 2nd element, because index starts from 0  
  //changing the element  
  al.set(1,"Dates");  
  //Traversing list  
  for(String fruit:al)    
    System.out.println(fruit);    
  
 }  
}  