package com.coforge3.Assignments;
import java.util.Scanner;

public class InsertAtPosition {
	
	public static void printArray(int arr[]) {
		System.out.print("[ ");
		for(int i=0 ; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("]");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int nums[] = {1, 3, 5, 8, 9};
		System.out.print("Enter the position: ");
		int posi = sc.nextInt();
		
		System.out.print("Enter the element: ");
		int val = sc.nextInt();
		
		int n = nums.length;
		
		if(posi == 0) {
			int temp[] = new int[n+1];
			temp[0] = val;
			for(int i=1 ; i<n+1 ; i++) {
				temp[i] = nums[i-1];
			}
			printArray(temp);
		}
		else if(posi == n) {
			int temp[] = new int[n+1];
			for(int i=0 ; i<n ; i++) {
				temp[i] = nums[i];
				
			}
			temp[n] = val;
			printArray(temp);

		}
		else {
			int temp[] = new int[n+1];
			for(int i=0 ; i<posi ; i++) {
				temp[i] = nums[i];
			}
			temp[posi] = val;
			
			for(int i= posi ; i<n ; i++) {
				temp[i+1] = nums[i];
			}
			printArray(temp);

		}
		
		sc.close();
	}

}
