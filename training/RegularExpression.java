package com.scuba.training;

import java.util.regex.*; //importing Regular expression resources


public class RegularExpression{  
public static void main(String args[]){  

Pattern p = Pattern.compile(".s");//. represents single character  
Matcher m = p.matcher("as");  
boolean b = m.matches();  
  
 
boolean b2=Pattern.compile(".s").matcher("as").matches();  
   
boolean b3 = Pattern.matches(".s", "as");  
  
System.out.println(b+" "+b2+" "+b3);  
}}