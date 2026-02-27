package com.coforge;

public class Circle implements Shape{
	
	private double radius;
	
	public Circle() {
		super();
	}

	
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}



	@Override
	public void circumference() {
		// TODO Auto-generated method stub
		System.out.println("Circumference of the circle: "+Math.PI * 2 * radius);		
	}
	
	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area of circle: "+Math.PI * radius * radius);	
	}
}
