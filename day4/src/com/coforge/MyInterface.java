package com.coforge;


//@FunctionalInterface
public interface MyInterface {
	
	
//	public void abstDisp();
	
	
	public default void display() {
		System.out.println("dafault details from the MtInterface Interface");
	}
	
	public static void useParking(String compName) {
		System.out.println(compName + " Using parking area.");
	}
	
	public static void warrantyPolicy() {
		System.out.println("Warranty period: 3 years");
	}
}

