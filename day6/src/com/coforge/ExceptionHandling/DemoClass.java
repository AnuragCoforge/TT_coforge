package com.coforge.ExceptionHandling;



public class DemoClass {

	
//	public static void calculate() {
//		int a = 5, b = 0;
//		if(b==0)
//			throw new ArithmeticException();
//		else
//			System.out.println(a/b);
//	}
	
	public static void checkAge(int age) throws AgeNotSufficientException{
		if(age > 15) {
			System.out.println("Eligible to register for 12th");
		}
		throw new AgeNotSufficientException("Age is less than 15");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//			calculate();
//		}catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		

		try {
			checkAge(17);
		}
		catch (AgeNotSufficientException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			
		}
		
		
		System.out.println("Application Completed");
	}

}
