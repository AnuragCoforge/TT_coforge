package com.coforge.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoTryCatch {
	public static void readFile() throws FileNotFoundException{
		FileReader reader = new FileReader("data.txt");
	}
	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
//		int a=5, b[] = {1,2,3,0,5};
//		try {
//			for(int i=0 ; i<=b.length ; i++) { // we are going out out out of bound but the first error will be arithematic so we catch it and directly comes out of this. 
//				System.out.println(a/b[i]);
//			}
//		}
//		catch(ArithmeticException  | ArrayIndexOutOfBoundsException  e) {
//			System.out.println("Arithematic exception");
//		}
//		catch(ArrayIndexOutOfBoundsException ae) { 
//			System.out.println("Exception Occured! ");
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
//		catch(RuntimeException re) {
//			System.out.println(re.getMessage());
//			re.printStackTrace();
//		}
//		finally {
//			
//		}
//		catch(Exception e) {
//			e.getMessage();
//			e.printStackTrace();
//		}
//		System.out.println("Application completed");
//		FileReader reader = null;
//		try {
//			reader = new FileReader("data.txt");
//			int ch;
//			while((ch = reader.read()) != -1) {
//				System.out.println((char)ch);
//			}
//		}
//		catch (FileNotFoundException fe) {
//			// TODO: handle exception
//			fe.printStackTrace();
//		}
//			catch(IOException ex) {
//				// TODO: handle exception
//				ex.printStackTrace();
//			}
//		finally {
//			try {
//				if(reader!=null)
//					reader.close();
//			}
//			catch(IOException ex) {
//				System.out.println("Exception Occured!");
//			}
//			
//		}
		
		
	
		
		readFile();
		
		
	}

}
