package com.demo.first_Hello;

public class Hello_Example {
	
	public void displayName(String name) {
		System.out.println("The name which given by the man method:-"+name);
	}
	
	public static void main(String[] args) {
		Hello_Example h1= new Hello_Example();
		h1.displayName("Gulshan");;
	}

}
