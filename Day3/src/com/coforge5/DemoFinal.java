package com.coforge5;

public class DemoFinal {
	private final String name; //initialize immideatly or during object creation
	
	DemoFinal(String name) {
		this.name = name;
	}
	
	public void printDetails() {
		System.out.println(this.name);
	}
	
	public static void main(String[] args) {
		DemoFinal dof = new DemoFinal("touRist");
		dof.printDetails();
		
	}
}
