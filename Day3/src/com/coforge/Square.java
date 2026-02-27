package com.coforge;

public class Square implements Shape{
	
	private double side;
	
	public Square() {
		super();
	}
	
	public Square(double side) {
		super();
		this.side = side;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("area of the square"+side * side);
		
	}
	@Override
	public void circumference() {
		// TODO Auto-generated method stub
		System.out.println("perimeter of the square"+4 * side);
	}
}
