package com.demo.first_Hello;

import java.util.Date;

public class Hello_Example {
	
	public void displayName(String name) {
		System.out.println("The name which given by the man method:-"+name);
	}
	
	public void displayName(String first_Name, String last_Name) {
		System.out.println("The name which is given by the Main method:-"+first_Name+" "+last_Name);
	}
	
	public void displayAge(String dob) {
		int x=0;
	String[] s=dob.split(dob, x);
	 int year=2018-x;
	 String year1=String.valueOf(year);
			 
		System.out.println("His age is:-"+year1);
	}
	public static void main(String[] args) {
		Hello_Example h1= new Hello_Example();
		h1.displayName("Gulshan");
		h1.displayName("Gulshan", "Kumar");;
	}

}
