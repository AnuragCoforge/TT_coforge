package com.coforge3;

public class Outer {
	public void printDet() {
		System.out.println("outer class");
	}
	
	public static class Inner {
		public void printDetInner() {
			System.out.println("inner class");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object of inner class
		
//		Outer.Inner in = new Inner();
//		in.printDetInner(); 
		
		
//		Inner inner = new Inner();
//		inner.printDetInner();
		
		//both the methods are fine but if the inner class is static we don't need to go for the first option
	}

}
