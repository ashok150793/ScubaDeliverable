package com.scuba.training;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class Employee{  
	 float salary=40000;  
	} 

class Programmer extends Employee{  
	 int bonus=10000;  
	 public static void main(String args[]){  
	   Programmer p=new Programmer();  
	   System.out.println("Programmer salary is:"+p.salary);  
	   System.out.println("Bonus of Programmer is:"+p.bonus);  
	}  
	}  