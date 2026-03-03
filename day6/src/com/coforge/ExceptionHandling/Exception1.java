package com.coforge.ExceptionHandling;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = null;
		
		try {
			System.out.println(s.charAt(3)); 
		}
		catch (NullPointerException ne) {
			// TODO: handle exception
			ne.printStackTrace();
			
		}
		finally {
			System.out.println("Application Completed");
		}
	}

}
