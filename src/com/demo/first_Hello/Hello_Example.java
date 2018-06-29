package com.demo.first_Hello;

public class Hello_Example {
	
	public void displayName(String name) {
		System.out.println("The name which given by the man method:-"+name);
	}
	
	public void displayName(String first_Name, String last_Name) {
		System.out.println("The name which is given by the Main method:-"+first_Name+" "+last_Name);
	}
	public static void main(String[] args) {
		Hello_Example h1= new Hello_Example();
		h1.displayName("Gulshan");
		h1.displayName("Gulshan", "Kumar");;
	}

}
