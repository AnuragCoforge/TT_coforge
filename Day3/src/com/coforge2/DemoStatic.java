package com.coforge2;

public class DemoStatic {
	static {
		System.out.println("first SB");
	}
	static {
		System.out.println("second SB");
	}
	
	
	public static void main(String[] args) {
		System.out.println("psvm");
	}
	static {
		System.out.println("third SB");
	}
}
