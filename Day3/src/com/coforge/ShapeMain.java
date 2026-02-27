package com.coforge;
import java.util.Scanner;
public class ShapeMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String type;
		System.out.print("Enter the type of shape: ");
		type = sc.nextLine();
		
		if(type.equals("circle")) {
			
			System.out.print("enter the radius: ");
			double r = sc.nextDouble();
			Circle c = new Circle(r);
			c.area();
			c.circumference();
		}
		else if(type.equals("square")) {
			
			System.out.println("enter the dimension: ");
			
			double s = sc.nextDouble();
			Square sq = new Square(s);
			sq.area();
			sq.circumference();
		}
		else {
			System.out.println("invalid choice !");
		}
		sc.close();
	}
}
