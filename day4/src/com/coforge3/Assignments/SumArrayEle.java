package com.coforge3.Assignments;

//Problem: Sum of Array Element
import java.util.Scanner;

public class SumArrayEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		int sum = 0;
		int nums[] = new int[n];
		
		System.out.println("Enter the elements: ");
		for(int i=0 ; i <n ; i++) {
			System.out.print("give the input for "+ i + "th element: ");
			nums[i] = sc.nextInt();
		}
		
		for(int i=0 ; i <n ; i++) {
			sum += nums[i];
		}
		
		System.out.println("The sum of all the elements in the array is: "+ sum);
		
		sc.close();
	}

}
