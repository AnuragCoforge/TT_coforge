package com.coforge;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//dynamic binding concept
		
		MyInterface mi = new DemoClass();
		mi.display();
		mi = new Hello();
//		mi.display();
		
		MyInterface.useParking("Coforge");
	}

}
